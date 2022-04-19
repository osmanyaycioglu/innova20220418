package com.innova.java.training.examples.scanner;

import java.util.Scanner;

public class ScannerExample {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("username : ");
        String x = scanner.nextLine();
        System.out.println("password : ");
        String y = scanner.nextLine();
        if ("123456".equals(y)) {
            System.out.println("Hoşgeldin : " + x);
            while (true) {
                System.out.println("1-Seçim");
                System.out.println("2-Seçim");
                System.out.println("3-Çıkış");
                System.out.println("seçiminiz:");
                int secim = scanner.nextInt();
                if (secim == 1) {
                    System.out.println("Birinciyi seçtiniz");
                } else if (secim == 2) {
                    System.out.println("İkinciyi seçtiniz");
                } else if (secim == 3) {
                    System.out.println("Güle güle");
                    break;
                } else {
                    System.out.println("1 yada 2 girmelisiniz. Çıkış için 3 e basın.");
                }
            }
        } else {
            System.out.println("Giriş hatası");
        }
    }
}

