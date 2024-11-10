package com.gmail.gloriyaarmen.lessonsJava.lesson05;

public class lesson05SwitchDemo {
    public static void main(String[] args) {
        int value = 1;

        if (value == 0) {
            System.out.println("ZERO");
        } else if (value == 1) {
            System.out.println("ONE");
        } else if (value == 2) {
            System.out.println("TWO");
        } else {
            System.out.println("Unknown value");
        }

        switch (value) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            default:
                System.out.println("Unknown value");
                break;
        }
        System.out.println("FINISH");
    }
}