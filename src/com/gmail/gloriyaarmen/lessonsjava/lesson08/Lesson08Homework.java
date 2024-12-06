package com.gmail.gloriyaarmen.lessonsjava.lesson08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson08Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вкажіть довжину массиву від 10 до 30:");
        int numberEntered = scanner.nextInt();
        System.out.println("Довжина массиву дорівнює " + numberEntered + ", і має наступні значення.");

        //  Генерируем массив из случайных чисел, длина массива заданна пользователем.
        Random random = new Random();
        Integer[] array = new Integer[numberEntered];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 101);
        }
        String strArray = Arrays.toString(array);
        System.out.println(strArray);

// Сортируем массив по увеличению
        for (int i = 1; i < array.length; i++) {
            int numberArray = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > numberArray) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = numberArray;
        }
        strArray = Arrays.toString(array);
        System.out.println();
        System.out.println("Відсортований массив має наступний вигляд:");
        System.out.println(strArray);

// После ввода пользователем числа от 1 до 100, поиск этого числа в массиве.
        System.out.println();
        System.out.println("Вкажіть чісло від 1 до 100 для його пошуку в массиві:");
        numberEntered = scanner.nextInt();

        int left = 0;
        int right = array.length - 1;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] > numberEntered) {
                right = middle - 1;
            } else if (array[middle] < numberEntered) {
                left = middle + 1;
            } else if(array[middle] == numberEntered){
                break;
            }
        }

        if (array[middle] == numberEntered) {
            System.out.println();
            System.out.println("Число " + numberEntered + " має індекс в массиві [" + middle + "]");
        } else {System.out.println();
            System.out.println("Число: " + numberEntered + " відсутнє в массиві.");
        }
    }
}