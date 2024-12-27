package com.gmail.gloriyaarmen.lessonsjava.lesson15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskDemo {
    public static void main(String[] args) {
        Task task = new Task(Status.TODO, "Learn Java");
        System.out.println("Primary task is: " + task);
        System.out.println("Expected duration: " + task.getStatus().getDefaultDuration());
        System.out.println(" -= IN PROGRESS =- ");
        task.setStatus(Status.IN_PROGRESS);
        Status currentStatus = task.getStatus();
        System.out.println("Current status is " + currentStatus);
        System.out.println("Expected duration after status was changed: " + task.getStatus().getDefaultDuration());
        currentStatus.run();

        System.out.println(" -= DONE =- ");
        task.setStatus(Status.DONE);
        currentStatus = task.getStatus();
        System.out.println("Current status is " + currentStatus);
        System.out.println("Expected duration after status was changed: " + task.getStatus().getDefaultDuration());
        currentStatus.run();


//        if (Status.DONE.equals(currentStatus)) {
        if (Status.DONE == currentStatus) {
            System.out.println("Status is DONE!");
        }

        Status[] availableStatus = Status.values();
        System.out.println("Available status: " + Arrays.toString(availableStatus));
        System.out.printf("%s has an ordinal == %d\n", currentStatus.name(), currentStatus.ordinal());
        Status anoverStatus = Status.valueOf("TODO");
        System.out.println("Anover status from String is: " + anoverStatus);

        switch (anoverStatus) {
            case IN_PROGRESS -> System.out.println("TODO behaviour");
            default -> System.out.println("Unknown  behaviour");
        }

//        task.setStatus(new Task.Status("FAKE STATUS"));   // error! constructor is private
//        System.out.println("Changed status is: " + task.getStatus());
    }
}
