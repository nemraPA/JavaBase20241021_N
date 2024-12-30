package com.gmail.gloriyaarmen.lessonsjava.lesson14.trenirovka;

class PackagePrivateCarRanner {
    public static void main(String[] args) {
//        Car.Engine engine = new Car.Engine("top engine");
//        System.out.println(engine);
        Car car = new Car("prety car");
        System.out.println(car);

        Car.Engine engine = car.new Engine("top engine");
        System.out.println(engine);
        car.setEngine(engine);
        System.out.println(car);
    }
}
