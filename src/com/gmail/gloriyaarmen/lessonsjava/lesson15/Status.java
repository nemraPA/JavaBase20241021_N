package com.gmail.gloriyaarmen.lessonsjava.lesson15;

public enum Status implements Runnable {
    TODO(9),
    IN_PROGRESS(47),
    DONE(1000000) {
        private static final String MESSEGE = "ALL DONE)";
        @Override
        public void run() {
            System.out.println(MESSEGE);
        }
    };

    Status(int defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    private int defaultDuration;

    public int getDefaultDuration() {
        return defaultDuration;
    }

    @Override
    public void run() {
        System.out.println("Running....");
    }
}
