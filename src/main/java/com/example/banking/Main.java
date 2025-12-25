package com.example.banking;

public class Main {
    public static void main(String[] args) {
        
        Account savings = new SavingsAccount("SA001", 10000);
        Account current = new CurrentAccount("CA001", 5000);

        savings.deposit(2000);
        current.withdrawAmount(1000);

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Current Account Interest: " + current.calculateInterest());

        System.out.println("\nSavings Transactions:");
        savings.getTransactions().forEach(tx ->
                System.out.println(tx.getType() + " - " + tx.getAmount())
        );

        System.out.println("\nCurrent Transactions:");
        current.getTransactions().forEach(txc ->
                System.out.println(txc.getType() + " - " + txc.getAmount())
        );
        
    }
}
