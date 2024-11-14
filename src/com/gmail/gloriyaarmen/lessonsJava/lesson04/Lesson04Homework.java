package com.gmail.gloriyaarmen.lessonsJava.lesson04;

import java.util.Random;

public class Lesson04Homework {
    public static void main(String[] args) {

        Random random = new Random();
        double price = 2430.68;
        double totalSales;
        String product = "smartfone";

        int days = random.nextInt(3, 9);
        totalSales = price * days;
        System.out.println();
        System.out.println("Product No 1: " + product);
        System.out.printf("total sales for %2s days is EUR %10.2f", days, totalSales);
        System.out.println();
        System.out.printf("sales by day is EUR %10.2f", price);
        System.out.println();


        product = "laptop";
        price = 1498.12;
        days = random.nextInt(3, 9);
        totalSales = price * days;
        System.out.println();
        System.out.println("Product No 1: " + product);
        System.out.printf("total sales for %2s days is EUR %10.2f", days, totalSales);
        System.out.println();
        System.out.printf("sales by day is EUR %10.2f", price);
        System.out.println();

    }

}
