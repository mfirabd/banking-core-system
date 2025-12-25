package com.example.banking;

public class Main {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SA001", 10000, 2); 
        Account current = new CurrentAccount("CA001", 5000, 1000);  

        savings.deposit(2000);  
        current.withdraw(1000);

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());
        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Current Account Interest: " + current.calculateInterest());
    }
}
