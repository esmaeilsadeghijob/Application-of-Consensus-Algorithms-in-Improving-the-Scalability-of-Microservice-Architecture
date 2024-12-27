package com.javatar.paymentservice.service;
// src/main/java/com/example/payment/service/PaymentService.java

import com.javatar.paymentservice.model.Payment;
import com.javatar.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
