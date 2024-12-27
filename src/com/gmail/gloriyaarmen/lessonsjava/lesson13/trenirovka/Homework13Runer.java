package com.gmail.gloriyaarmen.lessonsjava.lesson13.trenirovka;

public class Homework13Runer {
    public static void main(String[] args) {
        Figure[] figures = {
                new Square(7),
                new Circle(3),
                new Triangle(new double[]{4, 5, 6}),
        };

        System.out.println(figures[2].getSides(2));
        //double number = calculatefigures(figures, 1); //getSides(1);
        //System.out.println(number);

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

//    private static double calculatefigures(Figure[] figures, int position) {
//        double sum = 0;
//        for (Figure figure : figures) {
//            sum = figure.getSides(position);
//        }
//        return sum;
//    }
}