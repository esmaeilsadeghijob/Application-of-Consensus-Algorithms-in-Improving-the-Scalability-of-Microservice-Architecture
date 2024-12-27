package com.javatar.orderservice.service;

import com.javatar.orderservice.model.Proposal;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PaxosService {

    private Map<Long, Proposal> proposals = new ConcurrentHashMap<>();
    private Map<Long, Proposal> acceptedProposals = new ConcurrentHashMap<>();
    private AtomicInteger proposalNumber = new AtomicInteger(0);

    public synchronized Proposal prepare(Long id) {
        int proposalNum = proposalNumber.incrementAndGet();
        Proposal proposal = proposals.get(id);
        if (proposal == null) {
            proposal = new Proposal(id, proposalNum, null, 0);
            proposals.put(id, proposal);
        }
        proposal.setProposalNumber(proposalNum);
        return proposal;
    }

    public synchronized boolean accept(Long id, Proposal proposal) {
        Proposal currentProposal = proposals.get(id);
        if (currentProposal == null || currentProposal.getProposalNumber() <= proposal.getProposalNumber()) {
            proposals.put(id, proposal);
            acceptedProposals.put(id, proposal);
            return true;
        }
        return false;
    }

    public Proposal getAcceptedProposal(Long id) {
        return acceptedProposals.get(id);
    }
}

