package com.gmail.gloriyaarmen.lessonsjava.lesson13;

public class Hacker {
    private BankAccount account;

    public Hacker(BankAccount account) {
        this.account = account;
    }

    public void hack() {
        account.amount += (-100000);
    }
}
