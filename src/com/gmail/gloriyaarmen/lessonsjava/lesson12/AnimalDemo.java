package com.gmail.gloriyaarmen.lessonsjava.lesson12;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("dog", 1),
                new Animal("cat", 1)
        };
    }

    public static void print(Animal[] animals) {
        System.out.println();
        for (Animal animal : animals) {
            animal.describe();
        }
    }
}
