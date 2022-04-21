package com.innova.java.training.oo.polymorphism;


public class Bird implements IAnimal {

    @Override
    public String talk() {
        return "cik cik";
    }

    @Override
    public void move() {
        System.out.println("Uçuyorum");
    }

    @Override
    public void eat() {
        System.out.println("yeşillik yiyorum");
    }

}
