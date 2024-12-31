package com.gmail.gloriyaarmen.lessonsjava.lesson14.trenirovka;

public class Printer {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        print(consolePrinter);

//        class FormatedPrinter implements Printable {
//
//            @Override
//            public void print() {
//                System.out.print("Formated: ");
//                System.out.println(this);
//            }
//        }

//        FormatedPrinter formatedPrinter = new FormatedPrinter();
        Printable formatedPrinter = new Printable() {
            //            private int field = 10;
            @Override
            public void print() {
                System.out.println("Formated: ");
//                System.out.println(this);
//                someMethod();
            }

            @Override
            public void consolePrint() {
                System.out.println("Console printing....");
                Printable.super.consolePrint();
                System.out.println("Finish console printing....");
            }

            //            @Override                  // может быть только один метод в родительском классе Interface
//            public void anoverMethod() {//
//            }//
//            private void someMethod() {
//                System.out.println(this);
//            }
        };

        // это использование лямды
        //Printable anotherPrinter = () -> System.out.println("Another printer: some print"); // упрощенная форма записи использования Interface Printable (лямда) если только будет выполняться одна операция
        Printable anotherPrinter = () -> {  // та же запись только если будет выполняться несколько операций
            System.out.print("Another printer: ");
            System.out.println("some print");
        };

        print(formatedPrinter);
        print(anotherPrinter);

        formatedPrinter.consolePrint();
        anotherPrinter.consolePrint();

//        FormatedPrinter customeformatedPrinter = new FormatedPrinter();
//        customeformatedPrinter.formatedPrint();
//        customeformatedPrinter.print();

//        FormatedPrintable customformatedPrinter = new FormatedPrinter();
        Printable customformatedPrinter = new FormatedPrinter();
        ((FormatedPrintable) customformatedPrinter).formatedPrint();
        customformatedPrinter.print();

        severalInterfaces();
        staticMethodsInDifferentClasses();
    }

    private static void staticMethodsInDifferentClasses() {
        System.out.println(" -= staticMethodsInDifferntClasses DEMO =- ");
        ConsolePrinter printer = new ConsolePrinter();
//        ConsolePrinter printer = new PrettyConsolePrinter();
        printer.print();
        printer.dangerMethod();
    }

    private static void severalInterfaces() {
        System.out.println("-= severalInterfaces DEMO =-");
        Printable consolePrinter = new ConsolePrinter();
        consolePrinter.print();
    }

    public static void print(Printable printable) {
        printable.print();
    }

    public static class ConsolePrinter implements Printable, EmailSender {
        public static void dangerMethod() {
            System.out.println("Call dangerMethod in ConsolePrinter");
        }

        @Override
        public void print() {
            System.out.println(this);
        }

        @Override
        public void consolePrint() {
//            EmailSender.super.consolePrint();
            Printable.super.consolePrint();
        }

//        @Override                  // может быть только один метод в родительском классе Interface
//        public void anoverMethod() {
//
//        }

        @Override
        public String toString() {
            return "I'm ConsolePrinter " + hashCode();
        }
    }

    public static class PrettyConsolePrinter extends ConsolePrinter {
        public static void dangerMethod() {
            System.out.println("Call dangerMethod in PrettyConsolePrinter");
        }

        @Override
        public void print() {
            System.out.println("Call print in PrettyConsolePrinter");
        }
    }
}

class FormatedPrinter implements FormatedPrintable {

        @Override
        public void print() {
            System.out.println("Call print method....");
        }

        @Override
        public void formatedPrint() {
            System.out.println("Call formatedPrint method....");
        }
    }