package com.innova.java.training.oo.inheritance.exp1;


public class OORunner {

    public static void main(final String[] args) {
        B b = new B("osman");
        b.greet();
        b.hello();
        System.out.println("------------------");
        C c = new C("Ayşe");
        c.hello();
        c.greet();
        c.goodbye();
        System.out.println("------------------");
        A ax = new C("ali");
        B bx = new C("kemal");
        Object obj1 = new C("Veli");

    }
}
