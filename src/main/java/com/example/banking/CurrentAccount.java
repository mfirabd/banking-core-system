package com.example.banking;
public class CurrentAccount extends Account {
    private double overdraftLimit = 500; // Default overdraft limit

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // Current accounts do not earn interest
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            throw new IllegalArgumentException("Withdrawal exceeds overdraft limit");
        }
        balance -= amount;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative");
        }
        this.overdraftLimit = overdraftLimit;
    }
    
}
