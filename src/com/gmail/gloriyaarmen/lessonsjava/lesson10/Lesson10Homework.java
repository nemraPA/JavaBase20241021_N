package com.gmail.gloriyaarmen.lessonsjava.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson10Homework {
    public static void main(String[] args) {
        Scanner scannerN = new Scanner(System.in);
        System.out.println("Введіть ціле число (але не більше дев'ятизначного числа).");
        long value = scannerN.nextInt();
        System.out.printf("Квадрат числа %d дорівнює %,.0f.\n\n", value, getSquareNumber(value));

        System.out.println("Введіть послідовно два значення, радіус та висоту циліндра, з десятковою точністю через кому.");
        System.out.println("Введіть значення радіус.");
        float definedValueRadius = scannerN.nextFloat();
        System.out.println("Введіть значення радіус.");
        float definedValueHeight = scannerN.nextFloat();
        System.out.println("Об'єм циліндра з радіусом " + definedValueRadius + " і висотою 10.0 дорівнює  "
                + getCapacityCylinder(definedValueRadius, definedValueHeight));

        Integer[] array = {10, 20, 30, 40, 50};
        String strArray = Arrays.toString(array);
        System.out.println();
        System.out.println("Масив чисел: " + strArray);
        System.out.println("Сума всіх елементів масиву дорівнює: " + getSumArray(array) + ".");

        System.out.println();
        System.out.println("Введіть довільний короткий рядок.");
        //Scanner scannerS = new Scanner(System.in);
        String arbitraryString = scannerN.nextLine();
        System.out.println("Рядок в зворотньому порядку:");
        System.out.println(getInvertedArbitraryString(arbitraryString));

        System.out.println();
        System.out.println("Введіть послідовно два цілі числа від 1 до 10, перше буде числом, друге, ступенем цього числа.");
        System.out.println("Введіть перше число.");
        int numberA = scannerN.nextInt();
        System.out.println("Введіть друге число.");
        int numberB = scannerN.nextInt();
        float numberC = getPowerNumber(numberA, numberB);
        System.out.printf("%,.10f\n", numberC);

        System.out.println();
        System.out.println("Введіть ціле число n:");
        numberA = scannerN.nextInt();
        System.out.println("Введіть текстовий короткий рядок.");
        arbitraryString = scannerS.nextLine();
        getStringTimes(numberA, arbitraryString);
    }


    private static void getStringTimes(int a, String str) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    private static float getPowerNumber(int base, int exponent) {
        int b = Math.abs(exponent);
        float a = base;
        for (int i = 1; i < b; i++) {
            a = a * base;
        }
        if (exponent < 0) {
            return (1 / a);
        } else {
            return a;
        }
    }

    private static String getInvertedArbitraryString(String arbitraryStringMethod) {
        char[] arrayArbitraryString = arbitraryStringMethod.toCharArray();
        char[] repeatArrayArbitraryString = arbitraryStringMethod.toCharArray();
        for (int i = 0, j = repeatArrayArbitraryString.length - 1; i < arrayArbitraryString.length; i++, j--) {
            repeatArrayArbitraryString[j] = arrayArbitraryString[i];
        }
        arbitraryStringMethod = String.valueOf(repeatArrayArbitraryString);
        return arbitraryStringMethod;
    }

    private static int getSumArray(Integer[] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        return sumArray;
    }

    private static float getCapacityCylinder(float valueRadius, float valueHeight) {
        float sum = 0.0f;
        sum = 3.14159f * (valueRadius * valueRadius) * valueHeight;
        return sum;
    }

    private static double getSquareNumber(long meaning) {
        double sum = meaning;
        sum *= sum;
        return sum;
    }
}