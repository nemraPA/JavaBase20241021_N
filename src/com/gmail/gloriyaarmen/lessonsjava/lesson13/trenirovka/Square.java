package com.gmail.gloriyaarmen.lessonsjava.lesson13.trenirovka;

public class Square implements Figure {
    private final double sideValue;

    public Square(double sideValue) {
        this.sideValue = sideValue;
    }

    public double getSideValue() {
        return sideValue;
    }

    @Override
    public double area() {
        return 0;//sideValue * sideValue;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideValue=" + sideValue +
                '}';
    }

    @Override
    public double getSides(int number) {
        return number;
    }
}