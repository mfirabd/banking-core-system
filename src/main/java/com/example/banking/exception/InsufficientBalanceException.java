package com.example.banking.exception;
public class InsufficientBalanceException extends BankingException {
    public InsufficientBalanceException(double balance, double amount) {
        super(" Insufficient balance: Balance= " + balance + ", Amount " + amount);
    }
    
}