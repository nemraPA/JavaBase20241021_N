package com.gmail.gloriyaarmen.lessonsjava.lesson13.pizza;

public class DiabloPizza extends AbstractPizza {
    public DiabloPizza() {
        super("Diablo");
    }

    @Override
    public void make() {
        System.out.println("Make Diablo pizza: add chilly");
    }
}
