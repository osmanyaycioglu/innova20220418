package com.innova.java.training.oo.polymorphism;


public class Eagle extends AbstractBirdFamily {

    @Override
    public String talk() {
        return "vik vik";
    }

    @Override
    public void eat() {
        System.out.println("et yiyor");
    }
}
