package com.javatar.paxosservice;

import com.javatar.paxosservice.model.Transaction;
import com.javatar.paxosservice.repository.TransactionRepository;
import com.javatar.paxosservice.service.Acceptor;
import com.javatar.paxosservice.service.Learner;
import com.javatar.paxosservice.service.Proposer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PaxosServiceApplicationTests {

    @Autowired
    private Proposer proposer;
    @Autowired
    private Acceptor acceptor;
    @Autowired
    private Learner learner;
    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    public void testPaxosWorkflow() {
        // Propose a transaction
        proposer.propose("TestTransaction");
        Transaction transaction = transactionRepository.findAll().get(0);
        assertEquals("PROPOSED", transaction.getStatus());

        // Accept the transaction
        acceptor.accept(transaction.getId());
        transaction = transactionRepository.findById(transaction.getId()).orElseThrow();
        assertEquals("ACCEPTED", transaction.getStatus());

        // Learn the transaction
        learner.learn(transaction.getId());
        transaction = transactionRepository.findById(transaction.getId()).orElseThrow();
        assertEquals("LEARNED", transaction.getStatus());
    }
}
