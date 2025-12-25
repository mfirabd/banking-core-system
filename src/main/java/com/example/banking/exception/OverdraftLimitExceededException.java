package com.example.banking.exception;

public class OverdraftLimitExceededException extends BankingException {
    public OverdraftLimitExceededException(double limit, double amount) {
        super("Overdraft limit exceeded: Limit= " + limit + ", Amount " + amount);
    }
}
