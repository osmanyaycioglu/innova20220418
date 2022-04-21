package com.innova.java.training.oo.inheritance.exp1;


public class A {

    protected String name;

    public A(final String nameParam) {
        System.out.println("A oluştu");
        this.name = nameParam;
    }

    public void hello() {
        System.out.println("hello " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }
}
