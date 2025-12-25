package com.example.banking;
import com.example.banking.interest.NoInterestStrategy;
import com.example.banking.exception.OverdraftLimitExceededException;
public class CurrentAccount extends Account {
    private double overdraftLimit = 500; // Default overdraft limit

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance, new NoInterestStrategy());
    }

    @Override
    public double calculateInterest() {
        return 0; // Current accounts do not earn interest
    }

    @Override
    public void withdrawAmount(double amount) {
        if (amount > balance + overdraftLimit) {
            throw new OverdraftLimitExceededException(overdraftLimit, amount);
        }

        // ✅ delegate to parent to keep ledger logic
        super.withdrawAmount(amount);
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
