package com.gmail.gloriyaarmen.lessonsjava.lesson04;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class lesson04Arithmetic {

    public static void main(String[] args) {
//        divideExample();
//        modExample();

//        mathExamples();
//        random();
//        formating();
        homework04();

    }

    private static void homework04() {
        Random rendom = new Random();
        double smartfonePrice = 2430.68;
        double laptopPrice = 1498.12;
        double totalSales;
        int days;
        String productNo1 = "smartfone";
        String productNo2 = "laptop";

        int rendomNumber = rendom.nextInt(3, 9);
        days = rendomNumber;
        totalSales = smartfonePrice * days;
        System.out.println();
        System.out.println("Product No 1: " + productNo1);
        System.out.printf("total sales for %2s days is EUR %10.2f", days, totalSales);
        System.out.println();
        System.out.printf("sales by day is EUR %10.2f", smartfonePrice);
        System.out.println();


        rendomNumber = rendom.nextInt(3, 9);
        days = rendomNumber;
        totalSales = laptopPrice * days;
        System.out.println();
        System.out.println("Product No 1: " + productNo2);
        System.out.printf("total sales for %2s days is EUR %10.2f", days, totalSales);
        System.out.println();
        System.out.printf("sales by day is EUR %10.2f", laptopPrice);
        System.out.println();

    }

    private static void formating(){
        double value = 10.0 / 3;
        System.out.println("value = " + value);

        double result = Math.round(value * 100) / 100.0;
        System.out.println("result = " + result);

        System.out.printf("Rounded value = %10.2f, calculated value = %05d", value, 123 + 10);
    }

    private static void random() {
        Random random = new Random();
        int value = random.nextInt();
        System.out.println(value);
        value = random.nextInt(10, 20);
        System.out.println(value);

        value = ThreadLocalRandom.current().nextInt(20, 31);
        System.out.println(value);

    }

    private static void mathExamples() {
        long value = 9;
        double result = Math.sqrt(9 * value);
        System.out.println("sqrt(81) = " + result);

        value = Math.round(Math.pow(2, 3));
        System.out.println("value = " + value);

    }


    private static void modExample() {
        int a = 11;
        int b = 3;

        int result = a % b;
        System.out.println(result);
    }

    public static void divideExample() {
        int test01 = 77;
        System.out.println("Arithmetic_N " + test01);
        int a = 10;
        int b = 3;

        double result = (double) a/b;
        System.out.println(result);
    }

}
