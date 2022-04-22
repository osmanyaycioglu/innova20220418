package com.innova.java.training.oo.abstraction.intf;


public class HelloFactory {

    public static void showMenu() {
        System.out.println("1-English");
        System.out.println("2-Turkish");
        System.out.println("3-Spanish");
        System.out.println("4-chinesse");
        System.out.println("5-Russian");
    }

    public static IHello createHello(final int index) {
        switch (index) {
            case 1:
                return new HelloImpl();
            case 2:
                return new HelloTurkish();
            case 3:
                return new HelloSpanish();
            case 4:
                return new HelloChinesse();
            case 5:
                return new HelloRussian();
            default:
                return new HelloImpl();
        }
    }

}
