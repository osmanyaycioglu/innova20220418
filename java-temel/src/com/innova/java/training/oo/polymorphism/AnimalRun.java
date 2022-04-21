package com.innova.java.training.oo.polymorphism;


public class AnimalRun {

    public static void main(final String[] args) {
        IAnimal animal = new Bird();
        System.out.println(animal.talk());
        animal.move();
        animal.eat();
    }
}
