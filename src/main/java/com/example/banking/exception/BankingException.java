package com.example.banking.exception;

public abstract class BankingException extends RuntimeException {
    public BankingException(String message) {
        super(message);
    }
    
}
