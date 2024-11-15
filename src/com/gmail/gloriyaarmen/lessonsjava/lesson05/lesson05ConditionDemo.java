package com.gmail.gloriyaarmen.lessonsjava.lesson05;

public class lesson05ConditionDemo {
    public static void main(String[] args) {
        int result;
        int a = 11;
        int b = 12;

        if ( (a % 2 == 0) && (b % 2 == 0) ){
            System.out.println("00");
        } else {
            System.out.println("Unexpected");
        }

        if ( (a % 2 == 0) || (b % 2 == 0) ){
            System.out.println("00 or 10 or 01");
        } else {
            System.out.println("Unexpected");
        }

        if ( ! ((a % 2 == 0) | (b % 2 == 0)) ){
            System.out.println("00 or 10 or 01");
        } else {
            System.out.println("Unexpected");
        }


//        if (a % 2 == 0) {
//            if (b % 2 == 0) {
//                System.out.println("00");
//            } else {
//                System.out.println("Unexpected");
//            }
//        }

    }
}