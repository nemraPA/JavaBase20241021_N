package com.gmail.gloriyaarmen.lessonsjava.lesson13.trenirovka;

public class Homework13Runer {
    public static void main(String[] args) {
        Figure[] figures = {
                new Square(12),
                new Circle(3),
                new Triangle(new double[]{4, 6, 9}),
        };
        //System.out.println(Triangle.sides[1] = 7.0);
        System.out.println(figures[2].getSides(1));
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
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