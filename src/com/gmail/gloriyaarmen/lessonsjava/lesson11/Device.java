package com.gmail.gloriyaarmen.lessonsjava.lesson11;

public class Device {
    String imei;
    String name;

//    public Device() {
//        imei = "NO IMEI";
//    }

    public Device(String imei) {
//        imei = deviceImei;
        this.imei = imei;
    }

//    public Device(String deviceName) {
//        name = deviceName;
//    }

    public Device(String imei, String deviceName) {
//    imei = deviceImei;
        this(imei);
        this.imei = imei;
        name = deviceName;
    }

    public void describe() {
        System.out.println(name + " has imei == " + imei);
    }
}