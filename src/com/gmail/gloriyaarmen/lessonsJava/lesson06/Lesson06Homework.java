package com.gmail.gloriyaarmen.lessonsJava.lesson06;

import java.util.Scanner;

public class Lesson06Homework {
    public static void main(String[] args) {
        performСalculation();

    }

//  вычисление при помощи for

    private static void performСalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount from 1 to 10:");
        int numberEntered = scanner.nextInt();
        int[] arrayToCalculate = new int[numberEntered];

        int result = 0;
        for (int i = 1; i <= arrayToCalculate.length; i++) {
            arrayToCalculate[i - 1] = i;
            result = result + arrayToCalculate[i - 1];
            System.out.println(i + ") Num is " + i +  ", sum is " + result);
            if (i == arrayToCalculate.length) {
                System.out.println("_____________________");
                System.out.printf("Sum of numbers is %d", result);
                result = 0;
                break;
            }
        }

//  вычисление при помощи while

        System.out.println("\n");
        int i = 1;
        while(i <= arrayToCalculate.length){
            arrayToCalculate[i - 1] = i;
            result = result + arrayToCalculate[i - 1];
            System.out.println(i + ") Num is " + i +  ", sum is " + result);
            i++;
            if ((i - 1) == arrayToCalculate.length) {
                System.out.println("_____________________");
                System.out.printf("Sum of numbers is %d", result);
                result = 0;
                break;
            }
        }

//  вычисление при помощи do while

        System.out.println("\n");
        i = 1;
        do{
            arrayToCalculate[i - 1] = i;
            result = result + arrayToCalculate[i - 1];
            System.out.println(i + ") Num is " + i +  ", sum is " + result);
            i++;
        }while(i <= arrayToCalculate.length);
        if ((i - 1) == arrayToCalculate.length) {
            System.out.println("_____________________");
            System.out.printf("Sum of numbers is %d", result);
        }
    }

}
