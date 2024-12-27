package com.javatar.orderservice.service;

import com.javatar.orderservice.client.PaymentClient;
import com.javatar.orderservice.model.Order;
import com.javatar.orderservice.model.Payment;
import com.javatar.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EpicSagaService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PaymentClient paymentClient;

    @Transactional
    public Order startSaga(Order order) {
        // Step 1: Create Order
        Order createdOrder = orderRepository.save(order);

        // Step 2: Process Payment
        Payment payment = new Payment();
        payment.setOrderId(createdOrder.getId());
        payment.setAmount(order.getPrice() * order.getQuantity());

        Payment processedPayment = paymentClient.processPayment(payment);

        // If payment fails, compensate by canceling the order
        if (processedPayment == null) {
            orderRepository.deleteById(createdOrder.getId());
            throw new RuntimeException("Payment failed, order canceled");
        }

        return createdOrder;
    }
}

