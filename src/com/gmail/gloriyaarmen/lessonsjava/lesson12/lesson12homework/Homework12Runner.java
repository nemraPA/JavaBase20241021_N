package com.gmail.gloriyaarmen.lessonsjava.lesson12.lesson12homework;

public class Homework12Runner {
    public static void main(String[] args) {
        Employees employee = new Employees(
                "Hantil Yuriy Vadimovich",
                "engineer",
                "age@com.ua",
                380501234567d,
                40);

        employee.toString();

        Car car = new Car();
        car.toString();
    }

    public String toString() {
        System.out.println("Default text.");
        return null;
    }
}