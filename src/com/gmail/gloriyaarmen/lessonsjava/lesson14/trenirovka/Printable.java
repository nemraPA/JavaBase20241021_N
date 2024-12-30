package com.gmail.gloriyaarmen.lessonsjava.lesson14.trenirovka;

@FunctionalInterface
public interface Printable {
    public static final String DEFAULT_MESSAGE = "default message";
    void print();   //может быть только один метод
//    void anoverMethod();
    default void consolePrint(){
        System.out.println(DEFAULT_MESSAGE);
    }
}
