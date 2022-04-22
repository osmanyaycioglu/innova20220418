package com.innova.java.training.oo.abstraction.intf;


public class HelloRussian implements IGreet, ITest {

    @Override
    public String sayHello(final String nameParam) {
        return "Priviet " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "xyz " + nameParam;
    }

    @Override
    public String greetings(final String nameParam) {
        return "dhdhd " + nameParam;
    }

    @Override
    public void test() {
        System.out.println("test");
    }

}
