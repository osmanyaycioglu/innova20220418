package com.innova.java.training.navigation;


public class Bicycle implements INavigationElement {

    @Override
    public int goForward(final int kmParam) {
        return kmParam / 20;
    }

    @Override
    public int turn(final int speedParam,
                    final int angleParam) {
        return 5;
    }

}
