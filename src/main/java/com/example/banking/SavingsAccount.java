package com.example.banking;
import com.example.banking.interest.SavingsInterestStrategy;
public class SavingsAccount extends Account {
    private double interestRate = 2; // Annual interest rate in percentage

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance, new SavingsInterestStrategy());
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        this.interestRate = interestRate;
    }
    
}
