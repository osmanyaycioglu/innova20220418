package com.innova.java.training.oo.abstraction;


public class ConcreteA extends AbstractA {

    public ConcreteA(final String nameParam,
                     final String surnameParam) {
        super(nameParam,
              surnameParam);
    }

    @Override
    public String surnameVer() {
        return "veli";
    }

    @Override
    public String getHelloPrefix(final int indexParam) {
        if (indexParam == 1) {
            return "Hello";
        } else {
            return "Merhaba";
        }
    }

}
