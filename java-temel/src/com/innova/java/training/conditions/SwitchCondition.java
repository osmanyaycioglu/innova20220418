package com.innova.java.training.conditions;

import java.util.Scanner;

public class SwitchCondition {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 ile 4 arasında bir sayı girin : ");
            int sayi = scanner.nextInt();
            switch (sayi) {
                case 1:
                    System.out.println("Bir yazdınız");
                    break;
                case 2:
                    System.out.println("İki yazdınız");
                    break;
                case 3:
                    System.out.println("Üç yazdınız");
                    break;
                case 4:
                    System.out.println("Dört yazdınız");
                    break;
                default:
                    System.out.println("1-4 arasında girilmeli");
                    return;
            }
        }
    }
}
