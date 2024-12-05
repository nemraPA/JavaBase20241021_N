package com.gmail.gloriyaarmen.lessonsjava.lesson11;

import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {
        Character character = Character.valueOf('c');
//        int i = Integer.valueOf(42);
        Integer i = 42;

        int result = i + 10;
        System.out.println("result == " + result);
        ArrayList list = new ArrayList();
        list.add(i);
        System.out.println("First object of list is " + list.get(0));
    }
}
