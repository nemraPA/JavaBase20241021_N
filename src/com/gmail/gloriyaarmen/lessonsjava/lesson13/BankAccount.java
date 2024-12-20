package com.gmail.gloriyaarmen.lessonsjava.lesson13;

public class BankAccount implements Cloneable {
    private int amount;
    private int cardNumber;
    private boolean blocked;

    public BankAccount(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) { // изменить значение поля
        this.amount = amount;
    }

    public int getAmount() {    // получить значение поля
        return amount;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public boolean isBlocked() {
        return blocked;
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

    @Override
    public  String toString() {
       return "Overrided method) I have: " + amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
//        if (getClass() == obj.getClass()) {
//            return false;
//        }
        if (!(obj instanceof BankAccount)) {
            return false;
        }
        BankAccount that = (BankAccount) obj;
        return amount == that.amount;   // getAmount();
    }

    @Override
    public int hashCode() {
//        return 31 * amount + cardNumber;  // 1;
        return amount;
    }

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        return (BankAccount) super.clone();
    }
}