package com.gmail.gloriyaarmen.lessonsjava.lesson15.lesson15homework;

public class DayClass implements DayInterface{
    private String text;

    public DayClass (String text) {
        this.text = text;
    }

    @Override
    public void advise(String text) {
        this.text = text;
    }
}
