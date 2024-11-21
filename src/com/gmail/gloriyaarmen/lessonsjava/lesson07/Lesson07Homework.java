package com.gmail.gloriyaarmen.lessonsjava.lesson07;

import java.util.Arrays;
import java.util.Random;

public class Lesson07Homework {
    public static void main(String[] args) {
        Random random = new Random();       // исправил имя переменной на random
        Integer[] array = new Integer[20];  // исправил имя переменной на array
//вывод значений массива на печать
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 101);
            System.out.print(array[i] + ", ");
        }
// в таком варианете у меня получилось вывести масив в одну строку, но мы это еще не проходили
        String strArray = Arrays.toString(array);
        System.out.println();
        System.out.println("Елементи масиву: " + strArray);
//вывод суммы отрицательных чисел
        int negativeSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeSum += array[i];
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);
//количество парных и непарных чисел
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
//наименьшее и наибольшее число
        int smallIndexNumber = 0;        //при помощи твоего замечания смог улчшить этот код, минус две переменные.
        int bigIndexNumber = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[smallIndexNumber] > array[i]) {   // два отдельных ифа легче воспринимаются
                smallIndexNumber = i;
            }
            if (array[bigIndexNumber] < array[i]) {
                bigIndexNumber = i;
            }
        }
        System.out.println();
        System.out.println("Найменший елемент: " + array[smallIndexNumber] + " (з індексом " + smallIndexNumber + ")");
        System.out.println("Найбільший елемент: " + array[bigIndexNumber] + " (з індексом " + bigIndexNumber + ")");

//среднее арифметическое в массиве после первого отрицательного числа
        // позиция первого отрицательного
        double arithmeticMean = 0.0;
        int positionFirstNegative = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                positionFirstNegative = i;    //дужки прибрав
                break;
            }
        }
        // вычисление среднего значения или указание что нет отрицательных или оно последнее
        if (positionFirstNegative == array.length - 1) {    // очень хороший способ использовать длину массива, стараюсь запомнить его и использовать
            System.out.println();
            System.out.println("Від'ємне число останнє: ");
        } else if (positionFirstNegative == array.length) {
            System.out.println();
            System.out.println("Немаэ від'ємних чисел: ");
        } else {
            for (int j = positionFirstNegative + 1; j < (array.length); j++) {  // согласен, твой вариант лучше воспринимается, исправил на один раз +1
                arithmeticMean += array[j];
            }
            int numberOfElements = ((array.length - 1) - positionFirstNegative);
            arithmeticMean /= (numberOfElements);
            System.out.printf("Середнє арифметичне число: %.2f", arithmeticMean);
        }
    }
}
