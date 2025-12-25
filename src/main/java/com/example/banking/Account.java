package com.example.banking;

import com.example.banking.interest.InterestCalculationStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import com.example.banking.exception.InsufficientBalanceException;
import com.example.banking.exception.InvalidAmountException;

public abstract class Account {

    protected String accountNumber;
    protected double balance;
    protected InterestCalculationStrategy interestStrategy;

    // ✅ MUST be inside the class
    protected List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber, double balance, InterestCalculationStrategy interestStrategy) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestStrategy = interestStrategy;
    }

    public double calculateInterest() {
        return interestStrategy.calculate(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException(amount);
        }
        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount));
    }

    public void withdrawAmount(double amount) {
        
        if (amount <= 0) {
            throw new InvalidAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;

        transactions.add(new Transaction("WITHDRAW", amount));
    }


    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }
}