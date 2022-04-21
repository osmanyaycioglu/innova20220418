package com.innova.java.training.oo.abstraction.intf;


public abstract class AbstractHello implements IGreet {

    @Override
    public String sayHello(final String nameParam) {
        return "Hello " + nameParam;
    }

}
