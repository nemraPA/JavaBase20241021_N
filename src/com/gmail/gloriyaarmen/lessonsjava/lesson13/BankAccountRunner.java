package com.gmail.gloriyaarmen.lessonsjava.lesson13;

public class BankAccountRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        BankAccount account = new BankAccount(42000);
        account.info();

        account.addMoney(-100000);
        account.info();
        boolean blocked = account.isBlocked();
        System.out.println("Account is blocked: " + blocked);

        System.out.println("-= Hack account =-");
        Hacker hacker = new Hacker(account);
        hacker.hack();
        account.info();
        hacker.info();

        System.out.println("-= OBJECT CLASS =-");
        System.out.println(account);

        BankAccount anotherAccount = new BankAccount(42000);
//        anotherAccount = account;
        if (account.equals(anotherAccount)) {
            System.out.println("Accounts have the same amounts");
        } else {
            System.out.println("Not equals");
        }

        BankAccount clonedAccount = account.clone();
        clonedAccount.info();
        if (clonedAccount != account) {
            System.out.println("Successfuly cloned");
        }
    }
}