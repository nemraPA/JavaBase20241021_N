package com.gmail.gloriyaarmen.lessonsjava.lesson11;

public class DeviceRunner {
    public static void main(String[] args) {
       Device device = new Device("0001", "tyu");
       //device.imei = "imei-0001";
       //device.name = "First device";
        device.describe();

        Device anotherDevice = new Device("007");
        //anotherDevice.imei = "0007";
        anotherDevice.name = "anoverDevice";
        anotherDevice.describe();

        Device fake = device;
        fake.describe();
        fake.name = "FAKE";
        fake.describe();
        device.describe();
    }
}