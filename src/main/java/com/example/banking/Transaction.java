package com.example.banking;
import java.time.LocalDateTime;

import java.util.UUID;

public final class Transaction {

    private final String id;
    private final String type;
    private final double amount;
    private final LocalDateTime timestamp;
    private final String accountId;
    
    public Transaction(String accountId, String type, double amount) {
        this.id = UUID.randomUUID().toString();
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public String getAccountId() {
        return accountId;
    }
}