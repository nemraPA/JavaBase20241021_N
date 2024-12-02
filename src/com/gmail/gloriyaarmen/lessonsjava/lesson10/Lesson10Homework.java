package com.gmail.gloriyaarmen.lessonsjava.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson10Homework {
    public static void main(String[] args) {
        Scanner scannerN = new Scanner(System.in);
//        System.out.println("Введіть ціле число (але не більше дев'ятизначного числа).");
//        long value = scannerN.nextInt();
//
//        System.out.printf("Квадрат числа %d дорівнює %,.0f.\n\n", value, getSquareNumber(value));
//
//        System.out.println("Введіть послідовно два значення з десятковою точністю через кому, радіус та висоту циліндра.");
//        System.out.println("Введіть значення радіус.");
//        float definedValueRadius = scannerN.nextFloat();
//        System.out.println("Введіть значення радіус.");
//        float definedValueHeight = scannerN.nextFloat();
//        System.out.println("Об'єм циліндра з радіусом " + definedValueRadius + " і висотою 10.0 дорівнює  "
//                + getCapacityCylinder(definedValueRadius, definedValueHeight));

        Integer[] array = new Integer[]{10, 20, 30, 40, 50};
        String strArray = Arrays.toString(array);
        System.out.println();
        System.out.println("Масив чисел: " + strArray);
        System.out.println("Сума всіх елементів масиву дорівнює: " + getSumArray(array) + ".");

        System.out.println("Введіть довільний короткий рядок.");
        String arbitraryString = scannerN.nextLine();
        System.out.println(arbitraryString);
        char [] arrayArbitraryString = arbitraryString.toCharArray();
        char [] repeatArrayArbitraryString = arbitraryString.toCharArray();
        System.out.println(arrayArbitraryString[2]);

        for (int i = 0, j = arrayArbitraryString.length - 1; i < arrayArbitraryString.length; i++, j--) {
            repeatArrayArbitraryString[j] = arrayArbitraryString[i];
        }
        System.out.println(repeatArrayArbitraryString);
    }

    private static int getSumArray(Integer[] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++){
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
