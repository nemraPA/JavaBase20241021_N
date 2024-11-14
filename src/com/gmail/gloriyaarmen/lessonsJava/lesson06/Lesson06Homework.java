package com.gmail.gloriyaarmen.lessonsJava.lesson06;

import java.util.Scanner;

public class Lesson06Homework {
    public static void main(String[] args) {
//  вычисление при помощи for
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount from 1 to 10:");
        int numberEntered = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= numberEntered; i++) {
            result = result + i;
            System.out.println(i + ") Num is " + i + ", sum is " + result);
        }
        System.out.println("_____________________");
        System.out.printf("Sum of numbers is %d %s %s", result, "\n", "\n");
//  вычисление при помощи while
        result = 0;
        int i = 1;
        while (i <= numberEntered) {
            result = result + i;
            System.out.println(i + ") Num is " + i + ", sum is " + result);
            i++;
        }
        System.out.println("_____________________");
        System.out.printf("Sum of numbers is %d %s %s", result, "\n", "\n");
//  вычисление при помощи do while
        result = 0;
        i = 1;
        do {
            result = result + i;
            System.out.println(i + ") Num is " + i +  ", sum is " + result);
            i++;
        } while (i <= numberEntered);
        System.out.println("_____________________");
        System.out.printf("Sum of numbers is %d %s %s", result, "\n", "\n");
    }
}