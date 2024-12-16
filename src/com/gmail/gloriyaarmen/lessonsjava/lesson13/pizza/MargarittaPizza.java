package com.gmail.gloriyaarmen.lessonsjava.lesson13.pizza;

public class MargarittaPizza extends AbstractPizza {
    public MargarittaPizza() {
        super("Margaritta");
    }

    @Override
    public void make() {
        System.out.println("Making Margaritta pizza");
    }
}
