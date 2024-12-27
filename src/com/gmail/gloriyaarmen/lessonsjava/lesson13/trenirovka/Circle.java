package com.gmail.gloriyaarmen.lessonsjava.lesson13.trenirovka;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 0;//Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getSides(int number) {
        return number;
    }
}