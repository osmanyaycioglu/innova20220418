package com.innova.java.training.oo.inheritance.exp1;


public class C extends B {

    public C(final String nameParam) {
        super(nameParam);
        System.out.println("C oluştu");
    }

    public void goodbye() {
        System.out.println("Goodbye : " + super.name);
    }

    @Override
    public void hello() {
        System.out.println("Merhaba : " + this.getName());
        super.hello();
    }
}
