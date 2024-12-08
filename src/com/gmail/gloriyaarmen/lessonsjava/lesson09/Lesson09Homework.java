package com.gmail.gloriyaarmen.lessonsjava.lesson09;

import java.util.Random;
import java.util.Scanner;

public class Lesson09Homework {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір матриці від 2 до 5.");
        int value = scanner.nextInt();
        if (value <= 1 || value >= 6) {
            while (value <= 1 || value >= 6) {
                System.out.println("Допустимі значення тільки від 2 до 5.");
                value = scanner.nextInt();
            }
        }
        Integer[][] arrayMatrix = new Integer[value][value];    //для положительного результата на магический квадрат, вместо value в этой строке установить значение 3

        for (int i = 0; i < arrayMatrix.length; i++) {                      //для положительного результата на магический квадрат,
            for (int j = 0; j < arrayMatrix[i].length; j++) {               //весь этот блок
                arrayMatrix[i][j] = random.nextInt(1, 51);      //закомментировать
            }
        }

//        arrayMatrix[0][0] = 7;          //для положительного результата на магический квадрат, этот блок разкомментировать
//        arrayMatrix[0][1] = 14;
//        arrayMatrix[0][2] = 9;
//        arrayMatrix[1][0] = 12;
//        arrayMatrix[1][1] = 10;
//        arrayMatrix[1][2] = 8;
//        arrayMatrix[2][0] = 11;
//        arrayMatrix[2][1] = 6;
//        arrayMatrix[2][2] = 13;

        printArray(arrayMatrix);

//  Сумма элементов в парных и не парных рядках
        int evenRowSum = 0;
        int oddRowSum = 0;
        for (int i = 0; i < arrayMatrix.length; i++) {
            if (i % 2 == 0) {
                evenRowSum += getRowSum(arrayMatrix[i]);
            } else {
                oddRowSum += getRowSum(arrayMatrix[i]);
            }
        }
        System.out.println();
        System.out.println("Сума елементів у парних рядках: " + evenRowSum);
        System.out.println("Сума елементів у непарних рядках: " + oddRowSum);

//  Произведение элементов в парных и непарных столбцах
        double multiplicationEvenColumn = 1;
        double multiplicationOddColumn = 1;
        int position = 0;
        int arrayLength = arrayMatrix[position].length;
        int column = 0;

        for (column = 0; column < arrayLength; column++) {
            if (column % 2 == 0) {
                multiplicationEvenColumn *= getMultiplicationColumn(arrayMatrix, column);
            } else {
                multiplicationOddColumn *= getMultiplicationColumn(arrayMatrix, column);
            }
        }
        System.out.println();
        System.out.printf("Добуток елементів у парних стовпцях:   %,.0f\n", multiplicationEvenColumn);
        System.out.printf("Добуток елементів у непарних стовпцях: %,.0f\n", multiplicationOddColumn);
        System.out.println();

//  Проверка на магический квадрат
        int firstForComparison = getRowSum(arrayMatrix[0]);

        if (getCheckByRow(arrayMatrix, firstForComparison)) {
            System.out.println("Матриця є магічним квадратом!");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }

    private static boolean getCheckByRow(Integer[][] arrayMatrix, int firstForComparison) {
        long nextForComparison;
        for (int i = 1; i < arrayMatrix.length; i++) {
            nextForComparison = getRowSum(arrayMatrix[i]);
            if (firstForComparison != nextForComparison) {
                return false;
            }
        }
        for (int i = 0; i < arrayMatrix.length; i++) {
            nextForComparison = getColumnSum(arrayMatrix, i);
            if (firstForComparison != nextForComparison) {
                return false;
            }
        }
        nextForComparison = getFirstDiagonalSum(arrayMatrix);
        if (firstForComparison != nextForComparison) {
            return false;
        }
        nextForComparison = getSecondDiagonalSum(arrayMatrix);
        if (firstForComparison != nextForComparison) {
            return false;
        }
        return true;
    }

    private static void printArray(Integer[][] arrayMatrix) {
        for (int i = 0; i < arrayMatrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                System.out.printf(" %2d", arrayMatrix[i][j]);
            }
            System.out.print(" ]\n");
        }
    }

    private static int getFirstDiagonalSum(Integer[][] arrayMatrixMethod) {
        int sum = 0;
        for (int i = 0; i < arrayMatrixMethod.length; i++) {
            sum += arrayMatrixMethod[i][i];
        }
        return sum;
    }

    private static int getSecondDiagonalSum(Integer[][] arrayMatrixMethod) {
        int sum = 0;
        for (int i = 0, j = arrayMatrixMethod.length - 1; i < arrayMatrixMethod.length; i++, j--) {
            sum += arrayMatrixMethod[j][i];
        }
        return sum;
    }

    private static long getMultiplicationColumn(Integer[][] arrayMatrixInMethod, int positionColumn) {
        long product = 1;
        for (int i = 0; i < arrayMatrixInMethod.length; i++) {
            product *= arrayMatrixInMethod[i][positionColumn];
        }
        return product;
    }

    private static int getRowSum(Integer[] arrayMatrixInMethod) {
        int sum = 0;
        for (int j = 0; j < arrayMatrixInMethod.length; j++) {
            sum += arrayMatrixInMethod[j];
        }
        return sum;
    }

    private static long getColumnSum(Integer[][] arrayMatrixInMethod, int positionColumn) {
        int sum = 0;
        for (int i = 0; i < arrayMatrixInMethod.length; i++) {
            sum += arrayMatrixInMethod[i][positionColumn];
        }
        return sum;
    }
}