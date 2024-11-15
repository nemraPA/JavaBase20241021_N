package com.gmail.gloriyaarmen.lessonsjava.lesson02;

public class Lesson02InfoOrder {
    public static void main(String[] args) {
        int orderNo;
        String client;
        float priceEUR;
        String addressStreet;
        int addressNumber;

        String productName;
        String productPrice;
        String measure;
        String output;
        String CURRENCY = "EUR";
        Double price;

        orderNo = 1;
        client = "Alise";
        priceEUR = 305.99F;
        addressStreet = "Moon Street, ";
        addressNumber = 10;


        System.out.println("\nOrder No    " + orderNo + "   Client: " + client +
                "\nProduct:    " + "smartphone" +
                "\nPrice EUR   " + priceEUR +
                "\nAddress:    " + addressStreet + addressNumber);

        orderNo = 2;
        client = "Tom";
        priceEUR = 570.95F;
        addressStreet = "Terra Street, ";
        addressNumber = 17;


        System.out.println("\nOrder No    " + orderNo + "   Client: " + client +
                "\nProduct:    " + "laptop" +
                "\nPrice EUR   " + priceEUR +
                "\nAddress:    " + addressStreet + addressNumber);



        productName = "Orange";
        productPrice = "2.49";
        measure = "kg";

        price = Double.valueOf(productPrice);

        output = productName + ", price " +
                CURRENCY + " " + price + " per " +
                measure + ".";

        System.out.println("\n" + output);
    }
}
