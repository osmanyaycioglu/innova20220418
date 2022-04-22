package com.innova.java.training.oo.polymorphism;


public abstract class AbstractFourLegAnimal implements IAnimal {

    @Override
    public void move() {
        System.out.println("Dört ayak yürü");
    }

}
