package com.gmail.gloriyaarmen.lessonsjava.lesson14.trenirovka;

public class Printer {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        print(consolePrinter);
    }

    public static void print(Printable printable) {
        printable.print();
    }

    public static class ConsolePrinter implements Printable {
        @Override
        public void print() {
            System.out.println(this);
        }
    }
}
