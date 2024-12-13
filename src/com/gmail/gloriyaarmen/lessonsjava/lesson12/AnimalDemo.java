package com.gmail.gloriyaarmen.lessonsjava.lesson12;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("dog", 3),
                new Cat("cat", 1)
        };
        //print(animals);
        saySomething(animals);

        Cat cat = new Cat("pretty cat", 2, "black");
        cat.describe();
//        animals[1].describe();

        Animal britishCat = new BritishCat();
        //britishCat.describe();
        britishCat.say();
    }

    public static void print(Animal[] animals) {
        System.out.println();
        for (Animal animal : animals) {
            animal.describe();
        }
    }

    public static void saySomething(Animal[] animals) {
        System.out.println();
        System.out.println("SAYING....");
        for (Animal animal : animals) {
            animal.say();
        }
        System.out.println("==========");
    }

}
