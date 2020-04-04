package com.company;

public class SavingsAccount extends Account {

    public SavingsAccount(double interestOwing, double interestEarned, double balance, double overdraftLimit) {
        super(interestOwing, interestEarned, balance, overdraftLimit);

    }

    @Override
    public void withdrawal(double withdrawalAmount) {
        double balance = this.getBalance();
        if (balance == 0) {
            System.out.println("No money in saving s account.");
        } else if (withdrawalAmount > balance) {
            System.out.println("Not enough funds to withdraw " + withdrawalAmount);
        } else {
            super.withdrawal(withdrawalAmount);
        }
    }
}
