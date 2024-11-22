package com.gmail.gloriyaarmen.lessonsjava.lesson08;

public class Lesson08Algorithms {
    public static void main(String[] args) {
//        int[] array = {10, 3, 1, 6, 7, 2};
        int[] array = {20, 15, 19, 10, 17, 11, 6, 12, 16, 14, 2, 13, 7, 20, 1, 3};

        print(array);
        System.out.println();
        int steps = 0;
        boolean sorted = false;
        for (int j = 0; j < array.length; j++) {
            if (sorted) {
                break;
            }
            sorted = true;
            for (int i = 0; i < array.length - j - 1; i++) {
                steps++;
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = false;
                }
            }
            System.out.printf("Step#%2d: ", j);
            print(array);
        }
        System.out.println();
        System.out.println("Total step:" + steps);


        print(array);
        System.out.println("-= Binary search =-");
        int number = 20;
        int position = binarySort(array, number);
        System.out.printf("%d at position %d", number, position);
    }

    public static int binarySort(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;
        do {
            int middle = (left + right) / 2;
            if (array[middle] > number) {
                right = middle - 1;
            } else if (array[middle] < number) {
                left = middle + 1;
            } else {
                return middle;
            }
        } while (left <= right);
        return -1;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int element : array) {
            System.out.printf("%02d%s", element, "  " );
        }
        System.out.println("]");
    }

}
