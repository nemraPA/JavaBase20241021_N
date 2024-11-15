package com.gmail.gloriyaarmen.lessonsjava.lesson07;

import java.util.Arrays;
import java.util.Random;

public class Lesson07Homework {
    public static void main(String[] args) {
        Random myRandom = new Random();
        Integer[] myArray = new Integer[20];
//вывод значений массива на печать
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(-99, 100);
            System.out.print(myArray[i] + ", ");
        }
// в таком варианете у меня получилось вывести масив в одну строку, но мы это еще не проходили
        String strArray = Arrays.toString(myArray);
        System.out.println();
        System.out.println("Елементи масиву: " + strArray);
//вывод суммы отрицательных чисел
        int negativeSum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                negativeSum += myArray[i];
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);
//количество парных и непарных чисел
        int pairedSum = 0;
        int oddSum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                pairedSum++;
            } else {
                oddSum++;
            }
        }
        System.out.println("Кількість парних чисел: " + pairedSum);
        System.out.println("Кількість непарних чисел: " + oddSum);
//наименьшее число
        int smallNamber = myArray[0];
        int bigNamber = myArray[0];
        int smallIndexNumber =0;
        int bigIndexNumber = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (smallNamber > myArray[i]) {
                smallNamber = myArray[i];
                smallIndexNumber = i;
            } else if (bigNamber < myArray[i]){
                bigNamber = myArray[i];
                bigIndexNumber = i;
            }
        }
        System.out.println("Найменший елемент: " + smallNamber + " (з індексом " + smallIndexNumber + ")");
        System.out.println("Найбільший елемент: " + bigNamber + " (з індексом " + bigIndexNumber + ")");
//среднее арифметическое
        double arithmeticMean = 0;
        for (int i = 0; i < myArray.length; i++) {
            arithmeticMean += myArray[i];
        }
        arithmeticMean /= myArray.length;
        System.out.println("Середнє арифметичне число: " + arithmeticMean);
    }
}
