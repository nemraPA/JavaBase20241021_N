package com.gmail.gloriyaarmen.lessonsjava.lesson12.lesson12homework;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Start Electricity: completed.");
    }

    private void startCommand() {
        System.out.println("Start Command: completed.");
    }

    private void startFuelSystem() {
        System.out.println("Start Fuel System: completed.");
    }

    @Override
    public String toString() {
        startElectricity();
        startCommand();
        startFuelSystem();
        return null;
    }
}