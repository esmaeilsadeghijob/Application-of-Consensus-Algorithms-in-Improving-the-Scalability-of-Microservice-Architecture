package com.javatar.paxosservice.service;

import com.javatar.paxosservice.model.Transaction;
import com.javatar.paxosservice.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Learner {
    @Autowired
    private TransactionRepository transactionRepository;

    public void learn(Long transactionId) {
        // Implementation of the learn logic
        Transaction transaction = transactionRepository.findById(transactionId).orElseThrow();
        transaction.setStatus("LEARNED");
        transactionRepository.save(transaction);
    }
}