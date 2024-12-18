package com.gmail.gloriyaarmen.lessonsjava.lesson12.lesson12homework;

public class Employees {
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private int age;

    public Employees(String name, String position, String email, long phoneNumber, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nPosition: " + position +
                "\nEmail: " + email +
                "\nPhone number: +" + phoneNumber +
                "\nAge: " + age + "\n";
    }
}