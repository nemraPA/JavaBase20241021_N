package com.gmail.gloriyaarmen.lessonsjava.lesson10;

public class Lesson10Methods {
    public static void main(String[] args) {
//        2 * x + 4 ==0;
//        x == -4 / 2;
//

        System.out.println("2 * x + 4 == 0");
        System.out.println("x == " + findRoot(2, 4));

        System.out.println("-12 * x + 42 == 0");
        System.out.println("x == " + findRoot(-12.0, 42));
        System.out.println("x - 42 == 0");
        System.out.println("x == " + findRoot(-42));

        System.out.println("-= PRINT METHOD =-");
        String[] Lines = {"or", "foo", "bar"};
        print(Lines);

        stringDemo();
    }

    public static void print(String[] Lines) {
        if ("".equals(Lines[0])) {
            System.out.println("Have to finish");
            return;
        }
        for (int i = 0; i < Lines.length; i++){

            System.out.println(Lines[i]);
        }
    }

//    public static void print(String[] Lines) {
//        for (int i = 0; i < Lines.length; i++){
//            if ("".equals(Lines[0])) {
//                break;
//            }
//            System.out.println(Lines[i]);
//        }
//    }

//    public static void print(String[] Lines) {
//        for (String Line : Lines) {
//            if ("".equals(Line)) {
//                break;
//            }
//            System.out.println(Line);
//        }
//    }

    /**
     *      a * x + b == 0;
     **/
    public static double findRoot (double a, double b) {
        return -b / a;
    }

    public static double findRoot (int a, int b) {
        if (a == 0) {
            return 0;
        }
        return -b / (double)a;
    }

    /**
     *      x * b == 0;
     **/
    public static double findRoot (double b) {
        return -b;
    }

    public static void stringDemo() {
        String Line = "abcdifg";
        System.out.println("Length of Line" + Line.length());
        char ch = Line.charAt(2);
        System.out.println("Char at position: " + ch);
        char[] charArray = Line.toCharArray();
        System.out.println("Char at position: " + charArray[2]);
    }
}
