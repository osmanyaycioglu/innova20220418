package com.innova.java.training.oo.abstraction;

import java.util.Random;

public abstract class AbstractA {

    private final String name;
    private final String surname;

    public AbstractA(final String nameParam,
                     final String surnameParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
    }

    public void hello() {
        System.out.println(this.getHelloPrefix(new Random().nextInt(2))
                           + " "
                           + this.name
                           + " "
                           + this.surname
                           + " yukardaki class dan gelen soyisim : "
                           + this.surnameVer());
    }

    public abstract String surnameVer();

    public abstract String getHelloPrefix(int index);

}
