package com.gmail.gloriyaarmen.lessonsjava.lesson11.lesson11homework;

public class Person {
    String name;
    Integer age;
    String profession;

    public Person(String name, Integer age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void printInfo() {
        System.out.printf("   Ім'я: %s, Вік: %s, Професія: %s\n", name, age, profession);
    }

    public void changeProfession(String newProfession) {
        this.profession = newProfession;
    }
}