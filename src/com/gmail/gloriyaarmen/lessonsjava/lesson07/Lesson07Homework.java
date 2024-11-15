package com.gmail.gloriyaarmen.lessonsjava.lesson07;

import java.util.Arrays;
import java.util.Random;

public class Lesson07Homework {
    public static void main(String[] args) {
        Random randomForArray = new Random();
        Integer[] trainingArray = new Integer[20];
//вывод значений массива на печать
        for (int i = 0; i < trainingArray.length; i++) {
            trainingArray[i] = randomForArray.nextInt(-100, 101);
            System.out.print(trainingArray[i] + ", ");
        }
// в таком варианете у меня получилось вывести масив в одну строку, но мы это еще не проходили
        String strArray = Arrays.toString(trainingArray);
        System.out.println();
        System.out.println("Елементи масиву: " + strArray);
//вывод суммы отрицательных чисел
        int negativeSum = 0;
        for (int i = 0; i < trainingArray.length; i++) {
            if (trainingArray[i] < 0) {
                negativeSum += trainingArray[i];
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);
//количество парных и непарных чисел
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < trainingArray.length; i++) {
            if (trainingArray[i] % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenNumber);
        System.out.println("Кількість непарних чисел: " + oddNumber);
//наименьшее и наибольшее число
        int smallIndexNumber =0;        //при помощи твоего замечания смог улчшить этот код, минус две переменные.
        int bigIndexNumber = 0;
        for (int i = 1; i < trainingArray.length; i++) {
            if (trainingArray[smallIndexNumber] > trainingArray[i]) {
                smallIndexNumber = i;
            } else if (trainingArray[bigIndexNumber] < trainingArray[i]){
                trainingArray[bigIndexNumber] = trainingArray[i];
                bigIndexNumber = i;
            }
        }
        System.out.println("Найменший елемент: " + trainingArray[smallIndexNumber] + " (з індексом " + smallIndexNumber + ")");
        System.out.println("Найбільший елемент: " + trainingArray[bigIndexNumber] + " (з індексом " + bigIndexNumber + ")");
//среднее арифметическое в массиве после первого отрицательного числа
        double arithmeticMean = 0.0;
        int firstNegative = 0;
        for (int i = 0; i < trainingArray.length; i++) {
            if (trainingArray[i] < 0){
                firstNegative = (i + 1);
                break;
            }
        }
        for (int i = firstNegative; i < trainingArray.length; i++) {
            arithmeticMean += trainingArray[i];
        }

        arithmeticMean /= trainingArray.length;
        System.out.println("Середнє арифметичне число: " + arithmeticMean);
    }
}
