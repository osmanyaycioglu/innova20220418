package com.innova.java.training.navigation;


public class CarRun {

    public static void main(final String[] args) {
        System.out.println("-------------");
        Car myCar = new Car(10);
        int goForwardLoc = myCar.goForward(300);
        System.out.println("sonuç : " + goForwardLoc);
        System.out.println("-------------");
        Car bmwCar = new Car("BMW 520i",
                             100);
        int goForwardBWMLoc = bmwCar.goForward(300);
        System.out.println("sonuç : " + goForwardBWMLoc);
        System.out.println("------!------");
    }
}
