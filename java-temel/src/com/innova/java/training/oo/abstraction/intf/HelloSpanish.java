package com.innova.java.training.oo.abstraction.intf;


public class HelloSpanish implements IGreet, ITest {

    @Override
    public String sayHello(final String nameParam) {
        return "Ola " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Bon " + nameParam;
    }

    @Override
    public String greetings(final String nameParam) {
        return "Greetings " + nameParam;
    }

    @Override
    public void test() {
        System.out.println("test");
    }

}
