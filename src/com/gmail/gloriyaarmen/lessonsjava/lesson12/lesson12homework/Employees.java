package com.gmail.gloriyaarmen.lessonsjava.lesson12.lesson12homework;

public class Employees {
    private String name;
    private String position;
    private String email;
    private double phoneNumber;
    private int age;

    public Employees(String name, String position, String email, double phoneNumber, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.printf("Phone number: +%.0f\n", phoneNumber);
        System.out.println("Age: " + age);
        return null;
    }
}