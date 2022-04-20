package com.innova.java.training.lab.hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesiMenu {

    private Scanner       scanner;
    private HesapMakinesi hesapMakinesi;

    public HesapMakinesiMenu() {
        scanner = new Scanner(System.in);
        hesapMakinesi = new HesapMakinesi();
    }

    public void menuGoster() {
        System.out.println("1-toplama");
        System.out.println("2-cikarma");
        System.out.println("3-carpma");
        System.out.println("4-bolme");
    }

    public int secimYap() {
        System.out.println("Seçiminiz : ");
        int nextIntLoc = scanner.nextInt();
        return nextIntLoc;
    }

    public void islemYap(int secim) {
        System.out.println("Birinci değişken : ");
        int v1 = scanner.nextInt();
        System.out.println("İkinci değişken : ");
        int v2 = scanner.nextInt();
        switch (secim) {
            case 1:
                int toplamaLoc = hesapMakinesi.toplama(v1,
                                                       v2);
                System.out.println("Toplama sonucu : " + toplamaLoc);
                break;
            case 2:
                int cikarmaLoc = hesapMakinesi.cikarma(v1,
                                                       v2);
                System.out.println("Cikarma sonucu : " + cikarmaLoc);
                break;
            case 3:
                int carpmaLoc = hesapMakinesi.carpma(v1,
                                                     v2);
                System.out.println("Carpma sonucu : " + carpmaLoc);
                break;
            case 4:
                int bolmeLoc = hesapMakinesi.bolme(v1,
                                                   v2);
                System.out.println("Bolme sonucu : " + bolmeLoc);
                break;
            default:
                break;
        }
    }
}
