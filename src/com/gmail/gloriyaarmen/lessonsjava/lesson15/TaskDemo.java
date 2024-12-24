package com.gmail.gloriyaarmen.lessonsjava.lesson15;

public class TaskDemo {
    public static void main(String[] args) {
        Task task = new Task(Status.TODO, "Learn Java");
        System.out.println("Primary task is: " + task);
//        task.setStatus(new Task.Status("FAKE STATUS"));   // error! constructor is private
        System.out.println("Changed status is: " + task.getStatus());
    }
}
