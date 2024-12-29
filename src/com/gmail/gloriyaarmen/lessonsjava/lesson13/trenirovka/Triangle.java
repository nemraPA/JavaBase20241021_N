package com.gmail.gloriyaarmen.lessonsjava.lesson13.trenirovka;

import java.util.Arrays;

public class Triangle implements Figure {
    /*public static*/private final double[] sides;

    public Triangle(double[] sides) {
        this.sides = Arrays.copyOf(sides, sides.length);//sides;
    }

    @Override
    public double getSides(int number) {
        return sides[number];
    }

    @Override
    public double area() {
        double semiPerimeter = 0;
        for (double side : sides) {
            semiPerimeter += side;
        }
        semiPerimeter /= 2.0;
        return Math.sqrt(semiPerimeter *
                (semiPerimeter - sides[0]) *
                (semiPerimeter - sides[1]) *
                (semiPerimeter - sides[2]));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + Arrays.toString(sides) +
                '}';
    }
}