package com.innova.java.training.oo.abstraction.intf;

import java.util.Scanner;

public class IntfRun {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            HelloFactory.showMenu();
            System.out.println("seçiminiz : ");
            int nextIntLoc = scannerLoc.nextInt();
            IHello helloLoc = null;
            //            switch (nextIntLoc) {
            //                case 1:
            //                    helloLoc = new HelloImpl();
            //                case 2:
            //                    helloLoc = new HelloTurkish();
            //                case 3:
            //                    helloLoc = new HelloSpanish();
            //                case 4:
            //                    helloLoc = new HelloChinesse();
            //                case 5:
            //                    helloLoc = new HelloRussian();
            //                default:
            //                    helloLoc = new HelloImpl();
            //            }
            //            switch (nextIntLoc) {
            //                case 1: {
            //                    String sayHelloLoc = "hello osman";
            //                    String sayGoodbyeLoc = "Goodbye osman";
            //                    System.out.println("h : " + sayHelloLoc + " g : " + sayGoodbyeLoc);
            //                    break;
            //                }
            //                case 2: {
            //                    String sayHelloLoc = "selam osman";
            //                    String sayGoodbyeLoc = "güle güle osman";
            //                    System.out.println("h : " + sayHelloLoc + " g : " + sayGoodbyeLoc);
            //                    break;
            //                }
            //                default:
            //                    break;
            //            }
            helloLoc = HelloFactory.createHello(nextIntLoc);
            String sayHelloLoc = helloLoc.sayHello("osman");
            String sayGoodbyeLoc = helloLoc.sayGoodbye("osman");
            System.out.println("h : " + sayHelloLoc + " g : " + sayGoodbyeLoc);
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
