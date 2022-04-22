package com.innova.java.training.navigation;


public interface INavigationElement {

    int goForward(final int km);

    int turn(final int speed,
             final int angle);
}
