package com.example.banking;
import com.example.banking.interest.InterestCalculationStrategy;
public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected InterestCalculationStrategy interestStrategy;

    public Account(String accountNumber, double balance, InterestCalculationStrategy interestStrategy) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestStrategy = interestStrategy;
    }

    public double calculateInterest(){
        return interestStrategy.calculate(balance);
    };

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        } 
        balance -= amount;
    }

}