package com.javatar.orderservice.service;

import com.javatar.orderservice.model.Order;
import com.javatar.orderservice.model.Proposal;
import com.javatar.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PaxosService paxosService;

    public Order createOrder(Order order) {
        // Prepare phase
        Proposal proposal = paxosService.prepare(order.getId());
        proposal.setValue(order.toString());

        // Accept phase
        if (paxosService.accept(order.getId(), proposal)) {
            // Commit phase
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Failed to reach consensus for order creation");
        }
    }

    public void cancelOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}

