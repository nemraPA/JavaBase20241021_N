package com.gmail.gloriyaarmen.lessonsjava.lesson11.lesson11homework;

public class Lesson11Homework {
    public static void main(String[] args) {
        Person personFirst = new Person("John", 30, "Інженер");
        Person personSecond = new Person("Mary", 25, "Вчитель");
        Person personThird = new Person("Bob", 35, "Лікар");

        System.out.print("1. ");
        personFirst.describeN();
        System.out.print("   ");
        personSecond.describeN();
        System.out.print("   ");
        personThird.describeN();

        Person personFourth = new Person("Alice", 28, "Архітектор");
        System.out.print("\n\n2. ");
        personFourth.describeN();
        System.out.print("   (Після оновлення професії)\n");
        personThird.reName("Дизайнер");
        System.out.print("   ");
        personFourth.describeN();
    }
}
