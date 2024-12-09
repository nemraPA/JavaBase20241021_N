package com.gmail.gloriyaarmen.lessonsjava.lesson11.lesson11homework;

public class Lesson11Homework {
    public static void main(String[] args) {
        Person[] persons = {new Person("John", 30, "Інженер"),
                new Person("Mary", 25, "Вчитель"),
                new Person("Bob", 35, "Лікар")
        };

        System.out.print("1. ");
        persons[0].describe();
        System.out.print("   ");
        persons[1].describe();
        System.out.print("   ");
        persons[2].describe();

        Person personFourth = new Person("Alice", 28, "Архітектор");
        System.out.print("\n\n2. ");
        personFourth.describe();
        System.out.print("   (Після оновлення професії)\n");
        personFourth.reProfession("Дизайнер");
        System.out.print("   ");
        personFourth.describe();
    }
}