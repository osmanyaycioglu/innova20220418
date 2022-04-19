package com.innova.java.training.navigation;


public class Car {

    int avrgSpeed;

    int goForward(final int km) {
        int result = km / this.avrgSpeed;
        System.out.println("Calculated value : " + result);
        return result;
    }

    int turn(final int speed,
             final int angle) {
        return (speed * 180) / angle;
    }
}
