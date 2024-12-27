package com.javatar.orderservice.service;

import com.javatar.orderservice.model.Order;
import com.javatar.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private EpicSagaService epicSagaService;

    public Order createOrder(Order order) {
        // Start Epic Saga for order creation
        return epicSagaService.startSaga(order);
    }

    public void cancelOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
