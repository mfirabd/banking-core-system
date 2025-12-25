package com.example.banking;
import java.time.LocalDateTime;

import java.util.UUID;

public final class Transaction {

    private final String id;
    private final String type;
    private final double amount;
    private final LocalDateTime timestamp;
    
    public Transaction(String type, double amount) {
        this.id = UUID.randomUUID().toString();
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
}