package com.innova.java.training.navigation;


public class Car implements INavigationElement {

    int    avrgSpeed;
    String carName;

    Car() {
        this.avrgSpeed = 50;
        this.carName = "default";
    }

    Car(final int avr) {
        System.out.println("Car objesi yaratılıyor");
        this.avrgSpeed = avr;
        this.carName = "default";
    }

    Car(final String name,
        final int avr) {
        System.out.println("Car objesi yaratılıyor");
        this.avrgSpeed = avr;
        this.carName = name;
    }

    @Override
    public int goForward(final int km) {
        int result = km / this.avrgSpeed;
        System.out.println("Calculated value for " + this.carName + " : " + result);
        return result;
    }

    @Override
    public int turn(final int speed,
                    final int angle) {
        return (speed * 180) / angle;
    }
}
