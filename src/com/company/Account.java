package com.company;

public class Account {
    private double interestOwing;
    private double interestEarned;
    private double balance;
    private double overdraftLimit;

    public Account(double interestOwing, double interestEarned, double balance, double overdraftLimit) {
        this.interestOwing = interestOwing;
        this.interestEarned = interestEarned;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;

    }

    public double getInterestOwing(double interest) {
        if (balance < 0) {
            interestOwing = balance * interest;
            System.out.println(interestOwing);
            this.balance += interestOwing;
        }
        return interestOwing;
    }

    public double getInterestEarned(double interest) {
        if (balance > 0) {
            this.interestEarned = balance * interest;
            System.out.println(this.interestEarned);
            this.balance += this.interestEarned;
        }

        return this.interestEarned;
    }

    public double getBalance() {
        return this.balance;
    }

    public void printBalance(String prefix) {
        System.out.println(prefix + " " + this.balance);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Your balance after depositing " + depositAmount + " is: " + this.balance);
    }
//TODO Error with overdraft limit -> wrong balance
    public void withdrawal(double withdrawalAmount) {
        double overdraft = this.balance - withdrawalAmount;
        if (overdraft > this.overdraftLimit) {
            this.balance -= withdrawalAmount;
            System.out.println("Your balance after withdrawing is " + withdrawalAmount + " is " + balance);
        } else {
            System.out.println("Overdraft limited to " + this.overdraftLimit);
        }
    }
}
