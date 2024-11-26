package com.javatar.paxosservice.dataset;

import com.javatar.paxosservice.service.Proposer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private Proposer proposer;

    @Override
    public void run(String... args) throws Exception {
        // Load dataset and propose transactions
        List<String> dataset = Arrays.asList("Transaction1", "Transaction2", "Transaction3");
        for (String data : dataset) {
            proposer.propose(data);
        }
    }
}
