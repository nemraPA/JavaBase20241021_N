package com.gmail.gloriyaarmen.lessonsjava.lesson15;

public class Task {
//    private static final Status[] AVAILABLE_STATUS = {
//            Status.TODO,
//            Status.IN_PROGRESS,
//            Status.DONE
//    };

    private Status status;
    private String description;

    public Task(Status status, String description) {
        setStatus(status);
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
//        validate(status);
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

//    private void validate(String status) {
//        for (String availablaStatus : AVAILABLE_STATUS) {
//            if (availablaStatus.equals(status)) {
//                return;
//            }
//        }
//        throw new RuntimeException("Unexpected status: " + status);
//    }

    @Override
    public String toString() {
        return "Task{" +
                "status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

//    public class Status {
//        public static final com.gmail.gloriyaarmen.lessonsjava.lesson15.Status TODO = new com.gmail.gloriyaarmen.lessonsjava.lesson15.Status("TODO");
//        public static final com.gmail.gloriyaarmen.lessonsjava.lesson15.Status IN_PROGRESS = new com.gmail.gloriyaarmen.lessonsjava.lesson15.Status("IN_PROGRESS");
//        public static final com.gmail.gloriyaarmen.lessonsjava.lesson15.Status DONE = new com.gmail.gloriyaarmen.lessonsjava.lesson15.Status("DONE");
//
//        private String name;
//
//        private Status(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return name;
//        }
//    }
}