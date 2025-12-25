package com.example.banking.batch;
import com.example.banking.Account;

public class EndOfDayProcessor {
    public void process(Account account) {
        // Apply interest to the account balance
        double interest = account.calculateInterest();
        if (interest > 0) {
            account.deposit(interest);
        }
    }
}