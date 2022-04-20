package com.innova.java.training.examples.random;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random random = new Random();
        int nextIntLoc = random.nextInt(100);
        System.out.println("Generated : " + nextIntLoc);
    }
}
