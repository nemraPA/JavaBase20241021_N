package com.gmail.gloriyaarmen.lessonsjava.lesson09;

import java.util.Random;
import java.util.Scanner;

public class Lesson09Homework {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір матриці від 2 до 5.");
        int value = scanner.nextInt();
//        if (!(value > 1 & value < 6)) {
//            while (!(value > 1 & value < 6)) {
//                System.out.println("Допустимі значення тільки від 2 до 5.");
////                value = scanner.nextInt();
                value = 3;
//            }
//        }
        Integer[][] arrayMatrix = new Integer[value][value];

////  Заполняем массив случайными числами и выводим на печать
//        for (int i = 0; i < arrayMatrix.length; i++) {
//            for (int j = 0; j < arrayMatrix[i].length; j++) {
//                arrayMatrix[i][j] = random.nextInt(1, 51);
//                System.out.print(arrayMatrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//  для проверки квадрата
        arrayMatrix[0][0] = 13;
        arrayMatrix[0][1] = 8;
        arrayMatrix[0][2] = 15;
        arrayMatrix[1][0] = 14;
        arrayMatrix[1][1] = 12;
        arrayMatrix[1][2] = 10;
        arrayMatrix[2][0] = 9;
        arrayMatrix[2][1] = 16;
        arrayMatrix[2][2] = 11;
        //  Сумма элементов в парных и не парных рядках
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
        System.out.println("Сума елементів у парних рядках: " + positiveRowSum);
        System.out.println("Сума елементів у непарних рядках: " + negativeRowSum);

        //  Произведение элементов в парных и непарных столбцах
        long multiplicationPositiveColumn = 1;
        long multiplicationNegativeColumn = 1;
        for (int j = 0; j < arrayMatrix.length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arrayMatrix[j].length; i++) {
                    multiplicationPositiveColumn *= arrayMatrix[i][j];
                }
            } else {
                for (int i = 0; i < arrayMatrix[j].length; i++) {
                    multiplicationNegativeColumn *= arrayMatrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Добуток елементів у парних стовпцях:   " + multiplicationPositiveColumn);
        System.out.println("Добуток елементів у непарних стовпцях: " + multiplicationNegativeColumn);
        System.out.println();

        //  Проверка на магический квадрат
        int forComparisonResult = 1;   //переменная для суммы первой строки, для сравнения остальных сумм строк (столбцов, диагоналей)
        int magicSquare = 1;
//  сумма по строкам
        Integer[] arrayLineSum = new Integer[arrayMatrix.length];   //новый масив для хранения сумм строк (столбцов и диагоналей)
        for (int currentRowSum = 0, i = 0; i < arrayLineSum.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                currentRowSum += arrayMatrix[i][j];
            }
            arrayLineSum[i] = currentRowSum;
            currentRowSum = 0;
        }
        forComparisonResult = arrayLineSum[0];
        int pozition = 1;
        while (pozition < arrayLineSum.length) {
            if (forComparisonResult == arrayLineSum[pozition]) {   //проверка по строкам
                pozition++;
            } else {
                magicSquare = 0;
//                System.out.println("Матриця не є магічним квадратом.");
                break;
            }
        }
//  сумма по столбцам
        if (magicSquare == 1) {
            for (int currentRowSum = 0, j = 0; j < arrayLineSum.length; j++) {
                for (int i = 0; i < arrayMatrix[j].length; i++) {
                    currentRowSum += arrayMatrix[i][j];
                }
                arrayLineSum[j] = currentRowSum;
                currentRowSum = 0;
            }
            pozition = 0;
            while (pozition < arrayLineSum.length) {
                if (forComparisonResult == arrayLineSum[pozition]) {   //проверка по столбцам
                    pozition++;
                } else {
                    magicSquare = 0;
//                    System.out.println("Матриця не є магічним квадратом.");
                    break;
                }
            }
        }

//  сумма по диагоналям
        if (magicSquare == 1) {

            int firstDiagonalSum = 0;
            int secondDiagonalSum = 0;
            for (int i = 0, j = 0; i < arrayMatrix.length; i++, j++) {
                firstDiagonalSum += arrayMatrix[i][j];
            }
            for (int i = arrayMatrix.length - 1, j = 0; j < arrayMatrix.length; i--, j++) {
                secondDiagonalSum += arrayMatrix[i][j];
            }
            if (forComparisonResult == firstDiagonalSum & forComparisonResult != secondDiagonalSum) { //последняя проверка
                System.out.println("Матриця є магічним квадратом.");
            }
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}
