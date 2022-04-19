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

        } else {
            System.out.println("Giriş hatası");
        }
    }
}

