package com.gmail.gloriyaarmen.lessonsjava.lesson13.subpackage;

import com.gmail.gloriyaarmen.lessonsjava.lesson13.Hacker;

public class HackerRunner {
    public static void main(String[] args) {
        Hacker hacker = new Hacker(null);
//        hacker.hack();  // hack() has a package-private access имеет пакет-частный доступ
//        hacker.info();  // hack() has a package-private access имеет пакет-частный доступ
    }
}
