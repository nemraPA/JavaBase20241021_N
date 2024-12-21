package com.gmail.gloriyaarmen.lessonsjava.lesson13.lesson13homework;

public class Homework13Runer {
    public static void main(String[] args) {
        Figure[] figures = {
                new Square(7),
                new Circle(3),
                new Triangle(new double[]{5, 8, 7}),
        };
        double calculateTotalArea = calculateTotalArea(figures);
        System.out.println("Total sum of the areas of figures = " + calculateTotalArea);

    }

    private static double calculateTotalArea(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.area();
        }
        return sum;
    }
}