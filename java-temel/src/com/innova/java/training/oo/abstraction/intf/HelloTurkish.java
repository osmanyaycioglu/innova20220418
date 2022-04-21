package com.innova.java.training.oo.abstraction.intf;


public class HelloTurkish implements IGreet, ITest {

    @Override
    public String sayHello(final String nameParam) {
        return "Merhaba " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Güle güle " + nameParam;
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
