package com.javatar.paxosservice.controller;

import com.javatar.paxosservice.service.Acceptor;
import com.javatar.paxosservice.service.Learner;
import com.javatar.paxosservice.service.Proposer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paxos")
public class PaxosController {
    @Autowired
    private Proposer proposer;
    @Autowired
    private Acceptor acceptor;
    @Autowired
    private Learner learner;

    @PostMapping("/propose")
    public ResponseEntity<String> propose(@RequestBody String data) {
        proposer.propose(data);
        return ResponseEntity.ok("Proposal submitted");
    }

    @PostMapping("/accept/{id}")
    public ResponseEntity<String> accept(@PathVariable Long id) {
        acceptor.accept(id);
        return ResponseEntity.ok("Proposal accepted");
    }

    @PostMapping("/learn/{id}")
    public ResponseEntity<String> learn(@PathVariable Long id) {
        learner.learn(id);
        return ResponseEntity.ok("Proposal learned");
    }
}
