package com.gmail.gloriyaarmen.lessonsjava.lesson12.lesson12homework;

public class Homework12Runner {
    public static void main(String[] args) {
        Employees employee = new Employees(
                "Hantil Yuriy Vadimovich",
                "engineer",
                "age@com.ua",
                380501234567L,
                40);

        System.out.println(employee);

        Car car = new Car();
        car.start();

        System.out.println(car);
    }
}