package com.gmail.gloriyaarmen.lessonsjava.lesson12.lesson12homework;

public class Car {
    private String electricity;
    private String command;
    private String fuelSystem;

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        this.electricity = "\nStart Electricity: completed.";
    }

    private void startCommand() {
        this.command = ("\nStart Command: completed.");
    }

    private void startFuelSystem() {
        this.fuelSystem = ("\nStart Fuel System: completed.");
    }

    @Override
    public String toString() {
        return electricity +
                command +
                fuelSystem;
    }
}