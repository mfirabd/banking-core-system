package com.example.banking.exception;

public class InvalidAmountException extends BankingException {
    public InvalidAmountException(double amount) {
        super("Invalid amount: " + amount);
    }
}
