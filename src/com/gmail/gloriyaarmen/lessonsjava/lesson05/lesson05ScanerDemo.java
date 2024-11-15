package com.gmail.gloriyaarmen.lessonsjava.lesson05;

import java.util.Scanner;

public class lesson05ScanerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value (0-9):");
        int value = scanner.nextInt();
        System.out.println("Entered value == " + value);
        scanner.nextLine();
        System.out.println("Enter a string value: ");
        String line = scanner.nextLine();
        System.out.printf("Line == '%s'\n", line);
    }
}
