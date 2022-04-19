package com.innova.java.training.conditions;

import java.util.Scanner;

public class SwitchCondition2 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("bir isim girin : ");
            String isim = scanner.nextLine();
            switch (isim) {
                case "osman":
                    System.out.println("Osman selam");
                    break;
                case "ali":
                    System.out.println("Ali naber");
                    break;
                case "veli":
                    System.out.println("Ali veli");
                    break;
                default:
                    System.out.println("Seni tanımadım");
                    return;
            }
        }
    }
}
