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
//                value = scanner.nextInt();
        value = 3;
//            }
//        }
        Integer[][] arrayMatrix = new Integer[value][value + 2];

//  Заполняем массив случайными числами и выводим на печать
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                arrayMatrix[i][j] = random.nextInt(1, 51);
                System.out.print(arrayMatrix[i][j] + "\t");
            }
            System.out.println();
        }
//  для проверки квадрата
        arrayMatrix[0][0] = 13;
        arrayMatrix[0][1] = 8;
        arrayMatrix[0][2] = 15;
        arrayMatrix[0][3] = 14;
        arrayMatrix[0][4] = 12;
        arrayMatrix[1][0] = 10;
        arrayMatrix[1][1] = 9;
        arrayMatrix[1][2] = 16;
        arrayMatrix[1][3] = 11;
        arrayMatrix[1][4] = 17;
        arrayMatrix[2][0] = 7;
        arrayMatrix[2][1] = 11;
        arrayMatrix[2][2] = 6;
        arrayMatrix[2][3] = 1;
        arrayMatrix[2][4] = 3;
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                System.out.print(arrayMatrix[i][j] + "\t");
            }
            System.out.println();
        }
                //  Сумма элементов в парных и не парных рядках
                int evenRowSum = 0;
                int oddRowSum = 0;
                for (int i = 0; i < arrayMatrix.length; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < arrayMatrix[i].length; j++) {
                            evenRowSum += arrayMatrix[i][j];
                        }
                    } else {
                       oddRowSum = getRowSum(arrayMatrix[i]);
                    }
                }
                System.out.println();
                System.out.println("Сума елементів у парних рядках: " + evenRowSum);
                System.out.println("Сума елементів у непарних рядках: " + oddRowSum);

                //  Произведение элементов в парных и непарных столбцах
                long multiplicationEvenColumn = 1;
                long multiplicationOddColumn = 1;
                int k = 0;
                while (k < arrayMatrix[k].length) {
                    if (k % 2 == 0) {
                        for (int i = 0; i < arrayMatrix.length; i++) {
                            multiplicationEvenColumn *= arrayMatrix[i][k];
                        }
                    } else {
                        for (int i = 0; i < arrayMatrix.length; i++) {
                            multiplicationOddColumn *= arrayMatrix[i][k];
                        }
                    }
                    k++;
                }
                System.out.println();
                System.out.println("Добуток елементів у парних стовпцях:   " + multiplicationEvenColumn);
                System.out.println("Добуток елементів у непарних стовпцях: " + multiplicationOddColumn);
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

    private static int getRowSum(Integer[] arrayMatrix) {
        int sum = 0;
        for (int j = 0; j < arrayMatrix.length; j++) {
            sum += arrayMatrix[j];
        }
        return sum;
    }
}
