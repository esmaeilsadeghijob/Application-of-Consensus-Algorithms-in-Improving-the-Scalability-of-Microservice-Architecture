package com.javatar.paxosservice.service;

import com.javatar.paxosservice.model.Transaction;
import com.javatar.paxosservice.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Acceptor {
    @Autowired
    private TransactionRepository transactionRepository;

    public void accept(Long transactionId) {
        // Implementation of the accept logic
        Transaction transaction = transactionRepository.findById(transactionId).orElseThrow();
        transaction.setStatus("ACCEPTED");
        transactionRepository.save(transaction);
    }
}