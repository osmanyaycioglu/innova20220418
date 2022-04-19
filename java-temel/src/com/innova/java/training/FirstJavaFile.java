package com.innova.java.training;


public class FirstJavaFile {

    public static void main(final String[] args) {
        // comment 1
        /*
         * block comment
         *
         */
        byte b1 = 10;
        short s1 = 10;
        int i1 = 10;
        long l1 = 10;

        int a = 10; // comment 1
        int b = 1_000_000_000;
        long c = 10_000_000_000_000L;
        long myLongValue = 10;
        myLongValue = 100 + 20;
        System.out.println("value 1 : " + myLongValue); // String Concat
        System.out.println("value 1 : " + 20); // String Concat
        myLongValue = 110;
        System.out.println("value 2 : " + myLongValue); // String Concat
        myLongValue = (10 * 20 * (30 - 10)) + 90;
        myLongValue++;
        System.out.println("hello world " + a); // String Concat
    }

}
