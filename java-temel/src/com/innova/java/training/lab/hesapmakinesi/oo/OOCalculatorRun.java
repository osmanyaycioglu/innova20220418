package com.innova.java.training.lab.hesapmakinesi.oo;

import java.util.Scanner;

public class OOCalculatorRun {

    public static void main(final String[] args) {
        Scanner scannerLoc = new Scanner(System.in);
        ToplamaCalculateElement tce = new ToplamaCalculateElement();
        double calculateLoc = tce.calculate(scannerLoc);
        System.out.println("Sonuç : " + calculateLoc);
    }
}
