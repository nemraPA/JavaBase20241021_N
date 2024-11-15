package com.gmail.gloriyaarmen.lessonsjava.lesson05;

public class lesson05ForestGump {
    public static void main(String[] args) {
        int dangerLevel = 10;

        if (dangerLevel < 20) {
            System.out.println("All OK");
        } else if(dangerLevel < 50){
                System.out.println("Run, Forest, run!");
        }else{
            System.out.println("DANGER!!! RUUUN!!!");
        }

    }

/*        int a = 10;
        int b = -123;

        boolean result = a > b;
        System.out.println("a > b is " + result);
        result = a < b;
        System.out.println("a < b is " + result);
*/
}
