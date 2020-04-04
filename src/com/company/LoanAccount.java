package com.company;

public class LoanAccount extends  Account {

    public LoanAccount(double interestOwing, double interestEarned, double balance, double overdraftLimit) {
        super(interestOwing, interestEarned, balance, overdraftLimit);
    }

    @Override
    public void withdrawal(double withdrawalAmount) {
        System.out.println("This is a loan. Withdrawals not possible.");
    }

}
