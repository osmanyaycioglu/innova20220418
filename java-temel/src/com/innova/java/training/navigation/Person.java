package com.innova.java.training.navigation;


public class Person implements INavigationElement {

    @Override
    public int goForward(final int kmParam) {
        return kmParam / 5;
    }

    @Override
    public int turn(final int speedParam,
                    final int angleParam) {
        return 1;
    }

}
