package com.innova.java.training.oo.abstraction;


public class ConcreteB extends AbstractA {

    public ConcreteB(final String nameParam,
                     final String surnameParam) {
        super(nameParam,
              surnameParam);
    }

    @Override
    public String surnameVer() {
        return "Test";
    }

    @Override
    public String getHelloPrefix(final int indexParam) {
        return "Ola";
    }

}
