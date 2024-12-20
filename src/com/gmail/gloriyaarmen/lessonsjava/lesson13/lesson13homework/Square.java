package com.gmail.gloriyaarmen.lessonsjava.lesson13.lesson13homework;

public class Square implements Figures{
private final double sideValue;

public Square(double sideValue) {
    this.sideValue = sideValue;
}

    public double getSideValue() {
        return sideValue;
    }

    @Override
    public double area() {
        return sideValue * sideValue;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideValue=" + sideValue +
                '}';
    }
}