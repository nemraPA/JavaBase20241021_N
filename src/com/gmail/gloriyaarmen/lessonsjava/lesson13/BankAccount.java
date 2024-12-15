package com.gmail.gloriyaarmen.lessonsjava.lesson13;

public class BankAccount {
    int amount;

    public BankAccount(int amount) {
        this.amount = amount;
    }

    public void addMoney(int value) {
        if(amount + value < 0) {
            System.out.println("You don't have enough money");
            return;
        }
        this.amount += value;
    }

    public void info() {
        System.out.println("I have: " + amount);
    }
}