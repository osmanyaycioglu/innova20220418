package com.innova.java.training.oo.polymorphism;


public class AnimalRun {

    public static void main(final String[] args) {
        IAnimal animal = new Cat();
        System.out.println(animal.talk());
        animal.move();
        animal.eat();
    }
}
