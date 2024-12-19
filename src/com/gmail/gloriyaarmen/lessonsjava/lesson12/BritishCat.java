package com.gmail.gloriyaarmen.lessonsjava.lesson12;

public class BritishCat extends Cat {
    public void describe() {
        System.out.println("3 I'm a british cat");
        super.describe();
        say();
        //super.say();
    }

    @Override
    public void say() {
        System.out.println("Meow-meow in english");
    }
}