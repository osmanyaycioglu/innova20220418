package com.innova.java.training.exceptions;

import java.util.Scanner;

public class ScannerRealUsage {

    public static void main(final String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Birşeyler girin : ");
            String nextLineLoc = scanner.nextLine();
            System.out.println("Bunu Girdiniz : " + nextLineLoc);
            return;
        } catch (Exception eLoc) {
            System.err.println("Error oluştu : " + eLoc.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        // 1.7 den sonra
        try (Scanner scannerX = new Scanner(System.in)) {
            System.out.println("Birşeyler girin : ");
            String nextLineLoc = scannerX.nextLine();
            System.out.println("Bunu Girdiniz : " + nextLineLoc);
            return;
        } catch (Exception eLoc) {
            System.err.println("Error oluştu : " + eLoc.getMessage());
        }


    }
}
