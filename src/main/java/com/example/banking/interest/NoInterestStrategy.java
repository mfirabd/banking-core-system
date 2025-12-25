package com.example.banking.interest;
public class NoInterestStrategy implements InterestCalculationStrategy {
    @Override
    public double calculate(double balance) {
        return 0;
    }
}   