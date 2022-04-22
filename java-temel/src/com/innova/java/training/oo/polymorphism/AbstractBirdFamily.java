package com.innova.java.training.oo.polymorphism;


public abstract class AbstractBirdFamily implements IAnimal {

    @Override
    public void move() {
        System.out.println("Uçuyorum");
    }

    @Override
    public void eat() {
        System.out.println("yeşillik yiyorum");
    }

}
