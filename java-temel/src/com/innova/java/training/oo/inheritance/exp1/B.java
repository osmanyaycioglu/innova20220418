package com.innova.java.training.oo.inheritance.exp1;


public class B extends A {

    public B(final String nameParam) {
        super(nameParam);
        System.out.println("B oluştu");
    }

    protected String name;

    public void greet() {
        System.out.println("Greetings : " + this.name);
    }

    @Override
    public void hello() {
        System.out.println("Ola : " + super.name);
    }

}
