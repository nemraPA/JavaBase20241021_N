package com.gmail.gloriyaarmen.lessonsJava.lesson04;

import java.util.Random;

public class Lesson04Homework {
    public static void main(String[] args) {

        Random remdom = new Random();
        double smartfonePrice = 2430.68;
        double laptopPrice = 1498.12;
        double totalSales;
        String product = "smartfone";

        int days = remdom.nextInt(3, 9);
        totalSales = smartfonePrice * days;
        System.out.println();
        System.out.println("Product No 1: " + product);
        System.out.printf("total sales for %2s days is EUR %10.2f", days, totalSales);
        System.out.println();
        System.out.printf("sales by day is EUR %10.2f", smartfonePrice);
        System.out.println();


        product = "laptop";
        days = remdom.nextInt(3, 9);
        totalSales = laptopPrice * days;
        System.out.println();
        System.out.println("Product No 1: " + product);
        System.out.printf("total sales for %2s days is EUR %10.2f", days, totalSales);
        System.out.println();
        System.out.printf("sales by day is EUR %10.2f", laptopPrice);
        System.out.println();

    }

}
