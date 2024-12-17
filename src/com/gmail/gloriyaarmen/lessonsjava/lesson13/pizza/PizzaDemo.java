package com.gmail.gloriyaarmen.lessonsjava.lesson13.pizza;

public class PizzaDemo {
    public static void main(String[] args) {
        AbstractPizza[] pizzas = {
                new DiabloPizza(),
                new MargarittaPizza(),
                new DiabloPizza()//,
//                new Pizza("unknown pizza")
        };
//        for (AbstractPizza pizza : pizzas) {
        for (Pizza pizza : pizzas) {
            System.out.println("Pizza name is: " + ((AbstractPizza) pizza).getName());
            pizza.make();
            //pizza.getName();    // не вызывается этот метод
        }
    }
}