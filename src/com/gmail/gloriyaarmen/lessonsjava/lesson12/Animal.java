package com.gmail.gloriyaarmen.lessonsjava.lesson12;

public class Animal {
    String name;
    int age;

//    public Animal() {
//        this.name = "default name";
//        this.age = -1;
//    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void describe() {
        System.out.println("1 Im " + name + ". My age is " + age + ".");
    }

    public void say() {
        System.out.println("Default text");
    }
}