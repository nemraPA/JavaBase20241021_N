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
        long multiplicationPositiveRow = 1;
        long multiplicationNegativeRow = 1;
        for (int j = 0; j < arrayMatrix.length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arrayMatrix[j].length; i++) {
                    multiplicationPositiveRow *= arrayMatrix[i][j];
                }
            } else {
                for (int i = 0; i < arrayMatrix[j].length; i++) {
                    multiplicationNegativeRow *= arrayMatrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Добуток елементів у парних стовпцях:   " + multiplicationPositiveRow);
        System.out.println("Добуток елементів у непарних стовпцях: " + multiplicationNegativeRow);
        System.out.println();

        //  Проверка на магический квадрат
        //  По строкам
        int firstLineSum = 0;
        int secondLineSum = 0;
        int secondColumnSum = 0;
        int numberStep = 0;
        int numberLine = 0;
//        int currentRowSum = 0;

        Integer[] arrayLineSum = new Integer[arrayMatrix.length];
        for (int currentRowSum = 0,  i = 0; i < arrayLineSum.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                currentRowSum += arrayMatrix[i][j];
            }
            arrayLineSum[i] = currentRowSum;
            currentRowSum = 0;
        }

        int pozition = 0;
        while (pozition < arrayLineSum.length - 1){
            if (arrayLineSum[pozition] == arrayLineSum[pozition + 1]){
                pozition++;
            } else {
                System.out.println("Матриця не є магічним квадратом.");
                pozition = arrayLineSum.length;
            }
        }





        while (numberStep < 2) {
            numberStep++;

            if (numberStep == 1) {
                for (int i = numberLine, j = 0; j < arrayMatrix[i].length; j++) {
                    firstLineSum += arrayMatrix[i][j];
                }
                numberLine++;
            } else {
                for (int i = numberLine, j = 0; j < arrayMatrix[i].length; j++) {
                    secondLineSum += arrayMatrix[i][j];
                }
                numberLine++;
            }
        }
        if (firstLineSum == secondLineSum) {
            secondLineSum = 0;
            for (int i = numberLine, j = 0; j < arrayMatrix[i].length; j++) {
                secondLineSum += arrayMatrix[i][j];
            }
            numberLine++;
            if (firstLineSum == secondLineSum) {
                for (int i = numberLine, j = 0; j < arrayMatrix[i].length; j++) {
                    secondLineSum += arrayMatrix[i][j];
                }
            }
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
//            lineNumber++;
//
//        } else {
//            System.out.println("Матриця не є магічним квадратом.");
//            break;
//        }
//    }
//        int lineNumber = 1;
//        do {
//            for (int i = lineNumber, j = 0; j < arrayMatrix[i].length; j++) {
//                secondLineSum += arrayMatrix[i][j];
//            }
//            if (firstLineSum == secondLineSum) {
//                lineNumber++;
//                secondLineSum = 0;
//            } else {
//                System.out.println("Матриця не є магічним квадратом.");
//                break;
//            }
//        } while (lineNumber < arrayMatrix.length);
////  По столбцам
//        lineNumber = 0;
//        do {
//            for (int j = lineNumber, i = 0; i < arrayMatrix[j].length; i++) {
//                secondColumnSum += arrayMatrix[i][j];
//            }
//            if (firstLineSum == secondColumnSum) {
//                lineNumber++;
//                secondColumnSum = 0;
//            } else {
//                System.out.println("Матриця не є магічним квадратом.");
//                break;
//            }
//        } while (lineNumber < arrayMatrix.length);
//
//        //  По диагоналям
//        int firstDiagonalSum = 0;
//        int secondDiagonalSum = 0;
//        for (int i = 0, j = 0; i < arrayMatrix.length; i++, j++) {
//            firstDiagonalSum += arrayMatrix[i][j];
//        }
//        if (firstLineSum == firstDiagonalSum) {
//            for (int i = arrayMatrix.length - 1, j = 0; j < arrayMatrix.length; i--, j++) {
//                secondDiagonalSum += arrayMatrix[i][j];
//            }
//            if (firstDiagonalSum == secondDiagonalSum) {
//                System.out.println("Матриця є магічним квадратом.");
//            } else {
//                System.out.println("Матриця не є магічним квадратом.");
//            }
//        }
    }
}
