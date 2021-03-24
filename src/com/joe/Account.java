package com.joe;

public class Account {
    //class variable, osztaly szintu valtozo
    private static int numberOfAccounts = 0;
    // peldany valtozo/instance variables
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        numberOfAccounts++;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public double deposit(double amount) {
        balance += amount;
        System.out.println(name + "has $" + balance);
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(name + "has $" + balance);
        } else {
            System.out.println("Overdraft denied: ");
        }
        return balance;
    }

    public void transferMoney(double amount, Account acc) {
        if (this.balance < amount) {
            System.out.println("Transfer fails!");
        } else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Account of " + this.name + "becomes $" + this.balance);
            System.out.println("Account of " + acc.name + "becomes $" + acc.balance);
        }
    }

    public static int setNumbersOfAccount(int n) {
        numberOfAccounts = n;
        return numberOfAccounts;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}
