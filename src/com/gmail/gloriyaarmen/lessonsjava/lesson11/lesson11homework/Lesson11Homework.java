package com.gmail.gloriyaarmen.lessonsjava.lesson11.lesson11homework;

public class Lesson11Homework {
    public static void main(String[] args) {
        Person[] persons = {new Person("John", 30, "Інженер"),
                new Person("Mary", 25, "Вчитель"),
                new Person("Bob", 35, "Лікар"),
                new Person("Alice", 28, "Архітектор")
        };

        System.out.print("\n1.");
        for (int i = 0; i < persons.length - 1; i++) {
            persons[i].printInfo();
        }

        System.out.print("\n2.");
        persons[3].printInfo();
        System.out.println("     (Після оновлення професії)");
        persons[3].changeProfession("Дизайнер");
        System.out.print("  ");
        persons[3].printInfo();
    }
}