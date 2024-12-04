package com.gmail.gloriyaarmen.lessonsjava.lesson09;

public class Lesson09MultiArrays {
    public static void main(String[] args) {
//       int[][] matrix = new int[][] {
        int[][] matrix = new int[4][]; /*{
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9}
        }; */

        matrix[0] = new int[]{};//1, 2, 3, 1, 2};
        matrix[1] = new int[]{5, 6, 7, 8};
        matrix[2] = new int[0];
        matrix[3] = new int[5];
        matrix[1][3] = 42;
        matrix[3][4] = 52;

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            print(row);
            if (matrix[i] == null) {
                continue;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


//        cubeDemo();
    }

    private static void cubeDemo() {
        System.out.println("----------  CUBE  --------");
        int[][][] cube = new int[5][3][4];
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Layer #" + i);
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("----------  END CUBE  --------");
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}