package com.innova.java.training.oo.abstraction.intf;

import java.util.Scanner;

public class IntfRun {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            HelloFactory.showMenu();
            System.out.println("seçiminiz : ");
            int nextIntLoc = scannerLoc.nextInt();
            IHello helloLoc = HelloFactory.createHello(nextIntLoc);
            String sayHelloLoc = helloLoc.sayHello("osman");
            String sayGoodbyeLoc = helloLoc.sayGoodbye("osman");
            System.out.println("h : " + sayHelloLoc + " g : " + sayGoodbyeLoc);
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
