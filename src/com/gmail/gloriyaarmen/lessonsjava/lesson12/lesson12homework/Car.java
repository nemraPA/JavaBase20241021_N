package com.gmail.gloriyaarmen.lessonsjava.lesson12.lesson12homework;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        String status = "Start Electricity: completed.";
        info(status);
    }

    private void startCommand() {
        String status = "Start Command: completed.";
        info(status);
    }

    private void startFuelSystem() {
        String status = "Start Fuel System: completed.";
        info(status);
    }

    public void info(String message) {
        System.out.println(message);
    }
}