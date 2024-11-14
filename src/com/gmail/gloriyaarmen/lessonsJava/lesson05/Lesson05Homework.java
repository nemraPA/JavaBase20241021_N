package com.gmail.gloriyaarmen.lessonsJava.lesson05;

import java.util.Scanner;

public class Lesson05Homework {
    public static void main(String[] args) {

//        double value;
        double taxAmount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("To find out the tax amount,");
        System.out.println("enter an amount from 100 to 100,000:");
        double value = scanner.nextInt();

        if (value > 100 & value <= 10_000) {
            taxAmount = value * 0.025;
            System.out.printf("Your amount:%13.2f", value);
            System.out.println();
            System.out.printf("Tax on your amount:%7.2f", taxAmount);
        } else if (value > 10_000 & value <= 25_000) {
            taxAmount = value * 0.0435;
            System.out.printf("Your amount:%13.2f", value);
            System.out.println();
            System.out.printf("Tax on your amount:%7.2f", taxAmount);
        } else if (value > 25_000 & value <= 1_000_000_000) {
            taxAmount = value * 0.067;
            System.out.printf("Your amount:%13.2f", value);
            System.out.println();
            System.out.printf("Tax on your amount:%7.2f", taxAmount);
        } else {
            System.out.println("Invalid value entered, program terminated.");
        }
    }
}