package com.gmail.gloriyaarmen.lessonsJava.lesson06;

import java.util.Scanner;

public class Lesson06СyclesForEachDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input max value (1..10): ");
//        int bound = scanner.nextInt();
//        forDemo1();
//        forDemo2();
//        whileDemo();
        doWhileDemo();


    }

    private static void doWhileDemo() {
        int i = 1;
        do {
            int j = 1;
            while (j < 11) {
                int value = i * j;
                System.out.printf("%5d", value);
                j++;
            }
            System.out.println();
            i++;
        }while (i < 11);
    }


    private static void whileDemo() {
        int i = 1;
        while (i < 11) {
            int j = 1;
            while (j < 11) {
                int value = i * j;
                System.out.printf("%5d", value);
                j++;
            }
            System.out.println();
            i++;
        }
    }


    private static void forDemo2() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 1; j < 11; j++) {
                int value = i * j;
                System.out.printf("%5d", value);
            }
            System.out.println();

        }
    }


    private static void forDemo1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
//        if(bound >= 1){
//            System.out.println(1);
//        }
//        if(bound >= 2){
//            System.out.println(2);
//        }
//        if(bound >= 3){
//            System.out.println(3);
//        }
//        if(bound >=4){
//            System.out.println(4);
//        }
//        if(bound >= 5){
//            System.out.println(5);
//        }
//        if(bound >= 6){
//            System.out.println(6);
//        }
//        if(bound >= 7){
//            System.out.println(7);
//        }
//        if(bound >= 8){
//            System.out.println(8);
//        }
//        if(bound >= 9){
//            System.out.println(9);
//        }
//        if(bound >= 10){
//            System.out.println(10);
//        }

