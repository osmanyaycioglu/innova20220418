package com.innova.java.training.datatypes.string;


public class StringDatatype {

    public static void main(final String[] args) {
        String str = "xyz" + 1;
        String concatLoc = str.concat(" abc");

        str = str + "test";

        System.out.println("orjinal : " + str);
        System.out.println("concat : " + concatLoc);


        String strTest1 = "xyz";
        String strTest2 = "xyz";
        String strTest3 = "xyz";
        String strTest4 = "xyz";
        String strTest5 = "xyz";
        String strTest6 = "xyz";
        String strTestSon = new String("xyz");
        if (strTest1 == strTestSon) {
            System.out.println("Test ok");
        }
        String str1 = new String("xyz");
        if (str1.equals("xyz")) {
            System.out.println("Bunlar eşit");
        }
        System.out.println("STR1 = " + str1);
    }
}
