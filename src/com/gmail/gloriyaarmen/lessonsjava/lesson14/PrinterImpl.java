package com.gmail.gloriyaarmen.lessonsjava.lesson14;

public class PrinterImpl implements Printer{
    public static class Message {
        private String text;
        private String sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}

@Override
public void print(Message messege) {
    if (isEmpty)
}
