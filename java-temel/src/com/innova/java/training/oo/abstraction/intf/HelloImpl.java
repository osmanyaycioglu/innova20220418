package com.innova.java.training.oo.abstraction.intf;


public class HelloImpl implements IGreet, ITest {

    @Override
    public String sayHello(final String nameParam) {
        return "Hello " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Goodbye " + nameParam;
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
