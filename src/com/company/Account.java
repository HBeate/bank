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

    public double getInterestOwing() {
            return this.interestOwing * this.balance;
    }

    public double getInterestEarned() {
            return this.interestEarned * this.balance;
    }

    public double getInterest(){
        if (balance >=0 ){
            return getInterestEarned();
        } else {
            return getInterestOwing();
        }
    }

    public void setInterest(double interest) {
        this.balance = this.balance + interest;
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

    public void withdrawal(double withdrawalAmount) {
        double overdraft = this.balance - withdrawalAmount;
        if (overdraft >= this.overdraftLimit) {
            this.balance -= withdrawalAmount;
            System.out.println("Your balance after withdrawing " + withdrawalAmount + " is " + balance);
        } else {
            System.out.println("Overdraft limited to " + this.overdraftLimit);
        }
    }
}
