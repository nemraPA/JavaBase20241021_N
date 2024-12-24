package com.gmail.gloriyaarmen.lessonsjava.lesson14;

public class Lesson14HomeworkRunner {
    public static void main(String[] args) {
        ConsolePrinterImpl.Message[] messages = {
                new ConsolePrinterImpl.Message("Santa Clause", "Ho-ho-ho"),
                new ConsolePrinterImpl.Message("", "Ho-ho-ho"),
                new ConsolePrinterImpl.Message(null, "Ho-ho-ho"),
                new ConsolePrinterImpl.Message("Peter Parker", ""),
                new ConsolePrinterImpl.Message("Peter Parker", null),
                new ConsolePrinterImpl.Message(null, null),
                new ConsolePrinterImpl.Message("", "")
        };

        ConsolePrinterImpl printer = new ConsolePrinterImpl();
        for (ConsolePrinterImpl.Message message : messages) {
            printer.print(message);
        }
    }
}