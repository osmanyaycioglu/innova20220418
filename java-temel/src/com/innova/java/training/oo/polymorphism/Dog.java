package com.innova.java.training.oo.polymorphism;


public class Dog implements IAnimal {

    @Override
    public String talk() {
        return "hav hav";
    }

    @Override
    public void move() {
        System.out.println("4 ayak yürü");
    }

    @Override
    public void eat() {
        System.out.println("Kemik yiyorum");
    }

}
