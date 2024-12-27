package com.javatar.orderservice.model;

import lombok.Data;

@Data
public class Proposal {

    private Long id;
    private int proposalNumber;
    private String value;
    private int version;

    public Proposal(Long id, int proposalNumber, String value, int version) {
        this.id = id;
        this.proposalNumber = proposalNumber;
        this.value = value;
        this.version = version;
    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public int getProposalNumber() {
//        return proposalNumber;
//    }
//
//    public void setProposalNumber(int proposalNumber) {
//        this.proposalNumber = proposalNumber;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//    public int getVersion() {
//        return version;
//    }
//
//    public void setVersion(int version) {
//        this.version = version;
//    }
}
