package com.innova.java.training.navigation;


public class AnotherCar {

    int    avrgSpeed;
    String carName = "default";

    AnotherCar(int avrgSpeed) {
        this("default",
             avrgSpeed);
    }

    AnotherCar(String carName) {
        this(carName,
             50);
    }

    AnotherCar(String name,
               int avr) {
        System.out.println("Car objesi yaratılıyor");
        this.avrgSpeed = avr;
        this.carName = name;
    }

    int goForward(final int km) {
        int result = km / this.avrgSpeed;
        System.out.println("Calculated value for " + this.carName + " : " + result);
        return result;
    }

    int turn(final int speed,
             final int angle) {
        return (speed * 180) / angle;
    }
}
