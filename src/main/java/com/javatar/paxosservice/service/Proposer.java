package com.javatar.paxosservice.service;

import com.javatar.paxosservice.model.Transaction;
import com.javatar.paxosservice.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Proposer {
    @Autowired
    private TransactionRepository transactionRepository;

    public void propose(String data) {
        // Implementation of the propose logic
        Transaction transaction = new Transaction();
        transaction.setData(data);
        transaction.setStatus("PROPOSED");
        transactionRepository.save(transaction);
    }
}



