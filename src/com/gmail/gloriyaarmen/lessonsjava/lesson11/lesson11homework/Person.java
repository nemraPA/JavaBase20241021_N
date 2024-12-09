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

    public void describe() {
        System.out.println("Ім'я: " + name + "  Вік: " + age + "  Професія: " + profession);
    }

    public void reProfession(String newProfession) {
        this.profession = newProfession;
    }
}