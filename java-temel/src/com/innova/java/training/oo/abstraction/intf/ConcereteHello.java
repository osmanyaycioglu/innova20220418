package com.innova.java.training.oo.abstraction.intf;


public class ConcereteHello extends AbstractHello {

    @Override
    public String greetings(final String nameParam) {
        return "olamola " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "ByeBye " + nameParam;
    }

}
