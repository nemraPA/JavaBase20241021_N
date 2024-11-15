package com.gmail.gloriyaarmen.lessonsjava.lesson05;

public class TernaryOperator {
    public static void main(String[] args) {
        int result;
        int a = 28;
        int b = 25;

        result = a > b ? ((a % 2 == 0) ? 123 : -123) : -1;

        System.out.println(result);

//        if (a > b) {
//            result = 1;
//        } else {
//            result = -1;
//        }
//
//        System.out.println(result);
    }
}
