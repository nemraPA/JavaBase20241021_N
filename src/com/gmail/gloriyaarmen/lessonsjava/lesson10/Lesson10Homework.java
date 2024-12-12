package com.gmail.gloriyaarmen.lessonsjava.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson10Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число (але не більше дев'ятизначного числа).");
        long value = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Квадрат числа %d дорівнює %,.0f.\n\n", value, square(value));

        System.out.println("Введіть послідовно два значення, радіус та висоту циліндра, з десятковою точністю через кому.");
        System.out.println("Введіть значення радіус.");
        float definedValueRadius = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Введіть значення радіус.");
        float definedValueHeight = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Об'єм циліндра з радіусом " + definedValueRadius + " і висотою 10.0 дорівнює  "
                + cylinderVolume(definedValueRadius, definedValueHeight));

        Integer[] array = {10, 20, 30, 40, 50};
        String strArray = Arrays.toString(array);
        System.out.println();
        System.out.println("Масив чисел: " + strArray);
        System.out.println("Сума всіх елементів масиву дорівнює: " + sumArray(array) + ".");

        System.out.println();
        System.out.print("Введіть довільний короткий рядок:\n");
        String arbitraryString = scanner.nextLine();
        System.out.print("Рядок в зворотньому порядку:\n");
        System.out.println(invertString(arbitraryString));

        System.out.println();
        System.out.println("Введіть послідовно два цілі числа від 1 до 10, перше буде числом, друге, ступенем цього числа.");
        System.out.println("Введіть перше число.");
        int base = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть друге число.");
        int numberExponent = scanner.nextInt();
        scanner.nextLine();
        float result = power(base, numberExponent);
        System.out.printf("%,.10f\n", result);

        System.out.println();
        System.out.println("Введіть ціле число n:");
        base = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть текстовий короткий рядок.");
        arbitraryString = scanner.nextLine();
        printText(base, arbitraryString);
    }


    private static void printText(int times, String text) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    private static float power(int base, int exponent) {
        float result = base;
        int number;
        if (exponent < 0) {
            number = exponent * (-1);   //Math.abs(exponent);
        } else {
            number = exponent;
        }

        for (int i = 1; i < number; i++) {
            result = result * base;
        }
        if (exponent < 0) {
            return (1 / result);
        } else {
            return result;
        }
    }

    private static String invertString(String text) {
        char[] repeatArrayArbitraryString = new char[text.length()];
        for (int i = 0, j = text.length() - 1; i < text.length(); i++, j--) {
            repeatArrayArbitraryString[j] = text.charAt(i);
        }
        return String.valueOf(repeatArrayArbitraryString);
    }

    private static int sumArray(Integer[] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        return sumArray;
    }

    private static float cylinderVolume(float valueRadius, float valueHeight) {
        return (float) Math.PI * (valueRadius * valueRadius) * valueHeight;
    }

    private static double square(long meaning) {
        return meaning * meaning;
    }
}