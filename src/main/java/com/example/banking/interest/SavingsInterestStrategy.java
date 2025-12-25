package com.example.banking.interest;
public class SavingsInterestStrategy implements InterestCalculationStrategy {
    private static final double INTEREST_RATE = 0.02; // 2% interest rate

    @Override
    public double calculate(double balance) {
        return balance * INTEREST_RATE;
    }
}   