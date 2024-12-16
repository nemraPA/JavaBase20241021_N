package com.gmail.gloriyaarmen.lessonsjava.lesson13.pizza;

public abstract class AbstractPizza implements Pizza {
    private String name;

    public String getName() {
        return name;
    }

    public AbstractPizza(String name) {
        this.name = name;
    }

    @Override
    public abstract void make();
//    public void make() {
//        System.out.println("Unknown receipt. Can't make " + name + " pizza");
//    }
}