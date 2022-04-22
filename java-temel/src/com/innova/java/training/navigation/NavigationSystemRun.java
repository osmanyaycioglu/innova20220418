package com.innova.java.training.navigation;


public class NavigationSystemRun {

    public static void main(final String[] args) {
        INavigationElement navEl = new Bicycle();
        int zaman = navEl.goForward(100);
        zaman += navEl.turn(100,
                            90);
        System.out.println("Bu kadar zaman sonra : " + zaman);
    }
}
