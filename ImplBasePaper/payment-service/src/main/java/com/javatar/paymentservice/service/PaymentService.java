package com.javatar.paymentservice.service;

import com.javatar.paymentservice.model.Payment;
import com.javatar.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        boolean paymentSuccess = processPaymentLogic(payment);
        if (!paymentSuccess) {
            return null;
        }
        return paymentRepository.save(payment);
    }

    private boolean processPaymentLogic(Payment payment) {
        return Math.random() > 0.2;
    }
}
