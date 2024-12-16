package com.gmail.gloriyaarmen.lessonsjava.lesson13;

public class Hacker {
    private BankAccount accountN;

//    public Hacker() {
//        this.accountN = null;
//    }

    public Hacker(BankAccount account) {
        this.accountN = account;
    }
    //    public void hack() {
    void hack() {
//        accountN.amount += (-100000);
        accountN.addMoney(-100000);
//        info();
    }

    protected void info() {
        System.out.println("I'm a hacker)");
    }
}