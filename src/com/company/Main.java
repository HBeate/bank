package com.company;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(.05, 0.01, 500, -100);
        SavingsAccount savings1 = new SavingsAccount(0, .01, 5000, -3000);
        LoanAccount loanAccount1 = new LoanAccount(.01, .00, -200000, 0);

        System.out.println("ACCOUNT 1");
        account1.deposit(40);
        account1.withdrawal(700);
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Interest: " + account1.getInterest());
        account1.deposit(1000);
        account1.setInterest(account1.getInterest());
        System.out.println("Balance: " + account1.getBalance());

        System.out.println("SAVINGS 1 ");
        System.out.println("Interest: " + savings1.getInterest());
        savings1.setInterest(savings1.getInterest());
        System.out.println("Your Balance is: " + savings1.getBalance());
        savings1.printBalance("Hypo balance: ");
        savings1.printBalance("Raubeisen balance: ");
        savings1.withdrawal(4000);
        savings1.deposit(3000);
        savings1.withdrawal(4000);
        savings1.withdrawal(2000);
        savings1.withdrawal(500);
        System.out.println("Your Balance is: " + savings1.getBalance());
        System.out.println("Interest: " + savings1.getInterest());
        savings1.setInterest(savings1.getInterest());
        System.out.println("Balance " + savings1.getBalance());

        System.out.println("LOAN ACCOUNT 1");
        loanAccount1.getBalance();
        loanAccount1.withdrawal(500);
        loanAccount1.deposit(100000);
        loanAccount1.setInterest(loanAccount1.getInterest());
        System.out.println("Balance: " + loanAccount1.getBalance());
    }
}
