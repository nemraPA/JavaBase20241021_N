package com.gmail.gloriyaarmen.lessonsjava.lesson12.lesson12homework;

public class Employees {
    private String name;
    private String position;
    private String email;
    private double foneNumber;
    private int age;

    public Employees(String name, String position, String email, double foneNumber, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.foneNumber = foneNumber;
        this.age = age;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.printf("Fone number: +%.0f\n", foneNumber);
        System.out.println("Age: " + age);
    }
}