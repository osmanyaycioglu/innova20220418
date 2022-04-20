package com.innova.java.training.examples.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArraylistExample {

    private static final int RANDOM_LIMIT         = 100;
    private static final int ARRAYLIST_FILL_COUNT = 10;

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Random randomLoc = new Random();
        for (int iLoc = 0; iLoc < ARRAYLIST_FILL_COUNT; iLoc++) {
            strList.add("osman" + randomLoc.nextInt(RANDOM_LIMIT));
        }
        for (String stringLoc : strList) {
            System.out.println(stringLoc);
        }
    }
}
