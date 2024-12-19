package com.gmail.gloriyaarmen.lessonsjava.lesson13.subpackage;

import com.gmail.gloriyaarmen.lessonsjava.lesson13.BankAccount;
import com.gmail.gloriyaarmen.lessonsjava.lesson13.Hacker;

public class SmartHacker extends Hacker {

//    public SmartHacker() {
//        super(null);
//    }

    public SmartHacker(BankAccount account) {
        super(account);
    }

    public  void smartInfo() {
        info();
    }
}