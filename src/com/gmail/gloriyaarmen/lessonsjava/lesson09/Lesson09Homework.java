package com.gmail.gloriyaarmen.lessonsjava.lesson09;

import java.util.Random;
import java.util.Scanner;

public class Lesson09Homework {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір матриці від 2 до 5.");
        int value = scanner.nextInt();
        if (value < 2 | value >= 5) {
            while (value < 2 | value >= 5) {
                System.out.println("Допустимі значення тільки від 2 до 5.");
                value = scanner.nextInt();
            }
        }
        Integer[][] arrayMatrix = new Integer[value][value];

//  Заполняем массив случайными числами и выводим на печать
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                arrayMatrix[i][j] = random.nextInt(1, 51);
                System.out.print(arrayMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        int positiveRowSum = 0;
        int negativeRowSum = 0;
        for (int i = 0; i < arrayMatrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arrayMatrix[i].length; j++) {
                    positiveRowSum += arrayMatrix[i][j];
                }
            } else {
                for (int j = 0; j < arrayMatrix[i].length; j++) {
                    negativeRowSum += arrayMatrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + positiveRowSum);
        System.out.println("Сума елементів у парних рядках (рядок 1, 3): " + negativeRowSum);

        long multiplicationPositiveRow = 1;
        long multiplicationNegativeRow = 1;
        for (int i = 0; i < arrayMatrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arrayMatrix[i].length; j++) {
                    multiplicationPositiveRow *= arrayMatrix[i][j];
                }
            } else {
                for (int j = 0; j < arrayMatrix[i].length; j++) {
                    multiplicationNegativeRow *= arrayMatrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2):   " + multiplicationPositiveRow);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + multiplicationNegativeRow);

        positiveRowSum = 0;
        negativeRowSum = 0;
        int positiveColumnSum = 0;
        int negativeColumnSum = 0;
        for (int i = 0; i < arrayMatrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arrayMatrix[i].length; j++) {
                    positiveRowSum += arrayMatrix[i][j];
                }
            } else {
                for (int j = 0; j < arrayMatrix[i].length; j++) {
                    negativeRowSum += arrayMatrix[i][j];
                }
            }
        }
        if (positiveRowSum == negativeRowSum) {
            for (int i = 0; i < arrayMatrix.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < arrayMatrix[i].length; j++) {
                        positiveRowSum += arrayMatrix[i][j];
                    }
                } else {
                    for (int j = 0; j < arrayMatrix[i].length; j++) {
                        negativeRowSum += arrayMatrix[i][j];
                    }
                }
            }
        }
    }
}
