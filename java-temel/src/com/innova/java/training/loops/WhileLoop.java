package com.innova.java.training.loops;


public class WhileLoop {

    public static void main(final String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("While döngü : " + i);
            i++;
        }
        int j = 0;
        int k = 0;
        int l = 0;
        abc:
        while (j < 3) {
            j++;
            System.out.println("--------J : " + j + " döngüsüne girdim");
            k = 0;
            xyz:
            while (k < 4) {
                k++;
                System.out.println("+++++++K : " + k + " döngüsüne girdim");
                l = 0;
                asd:
                while (l < 6) {
                    l++;
                    System.out.println("L : " + l + " döngüsüne girdim");
                    if (l >= 2) {
                        continue abc;
                    }
                }
                System.out.println("K döngü sonu");
            }
        }
    }
}
