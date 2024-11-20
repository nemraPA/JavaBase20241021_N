package com.gmail.gloriyaarmen.lessonsjava.lesson08;

public class Lesson08Algorithms {
    public static void main(String[] args) {
        int[] array = {10, 3, 1, 6, 7, 2};

        print(array);

        for (int j = 0; j < array.length; j++){
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
            System.out.print("Step#" + j + ": ");
            print(array);
        }

        print(array);
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println("]");

    }

}
