package com.innova.java.training.oo.abstraction;


public class AbstractRun {

    public static void main(final String[] args) {
        ConcreteA aLoc = new ConcreteA("osman",
                                       "yaycıoğlu");
        aLoc.hello();
        aLoc.hello();
        aLoc.hello();
        aLoc.hello();
        aLoc.hello();
        aLoc.hello();
        aLoc.hello();
        System.out.println("**-------------**");
        ConcreteB bLoc = new ConcreteB("osman",
                                       "yaycıoğlu");
        bLoc.hello();
        bLoc.hello();

    }
}
