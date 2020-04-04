package com.company;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account(.05, 0.01, 500, -100);
        SavingsAccount savings1 = new SavingsAccount(0, .01, 5000, -3000);
        System.out.println("ACCOUNT 1");
        account1.deposit(40);
        account1.deposit(60);
        account1.withdrawal(700);
        account1.getInterestOwing(.05);
        double balance = account1.getBalance();
        System.out.println("Balance: " + balance);
        account1.deposit(1000);
        balance = account1.getBalance();
        System.out.println("Balance: " + balance);


        System.out.println("SAVINGS 1 ");
        balance = savings1.getBalance();
        System.out.println("Your Balance is: " + balance);
        savings1.printBalance("Hypo balance: ");
        savings1.printBalance("Raubeisen balance: ");
        savings1.withdrawal(4000);
        savings1.getBalance();
        savings1.withdrawal(1000);
        savings1.getBalance();
        savings1.deposit(3000);
        savings1.getBalance();
        savings1.withdrawal(4000);
        savings1.withdrawal(2000);
        savings1.withdrawal(500);
        balance = savings1.getBalance();
        System.out.println("Your Balance is: " + balance);
        double interest = savings1.getInterest();
        System.out.println("Interest: " + interest);
    }

}
