package com.gmail.gloriyaarmen.lessonsjava.lesson11.lesson11homework;

public class Person {
    String name;
    Integer age;
    String profession;

    public Person(String nameN, Integer ageN, String professionN) {
        name = nameN;
        age = ageN;
        profession = professionN;
    }

    public void describeN() {
        System.out.println("Ім'я: " + name + "  Вік: " + age + "  Професія: " + profession);
    }

    public void reName(String newName) {
        this.name = newName;
    }
}
