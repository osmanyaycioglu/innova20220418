package com.innova.java.training.lab.hesapmakinesi;

import static com.innova.java.training.lab.hesapmakinesi.HesapMakinesiSabitleri.BOLME_INDEXI;
import static com.innova.java.training.lab.hesapmakinesi.HesapMakinesiSabitleri.CARPMA_INDEXI;
import static com.innova.java.training.lab.hesapmakinesi.HesapMakinesiSabitleri.CIKARMA_INDEXI;
import static com.innova.java.training.lab.hesapmakinesi.HesapMakinesiSabitleri.TOPLAMA_INDEXI;

import java.util.Scanner;

public class HesapMakinesiMenu {


    private final Scanner       scanner;
    private final HesapMakinesi hesapMakinesi;

    public HesapMakinesiMenu() {
        this.scanner = new Scanner(System.in);
        this.hesapMakinesi = new HesapMakinesi();
    }

    public void menuGoster() {
        System.out.println(TOPLAMA_INDEXI + "-toplama");
        System.out.println(CIKARMA_INDEXI + "-cikarma");
        System.out.println(CARPMA_INDEXI + "-carpma");
        System.out.println(BOLME_INDEXI + "-bolme");
    }

    public int secimYap() {
        System.out.println("Seçiminiz : ");
        int nextIntLoc = this.scanner.nextInt();
        return nextIntLoc;
    }

    public void islemYap(final int secim) {
        System.out.println("Birinci değişken : ");
        int v1 = this.scanner.nextInt();
        System.out.println("İkinci değişken : ");
        int v2 = this.scanner.nextInt();
        switch (secim) {
            case TOPLAMA_INDEXI:
                int toplamaLoc = this.hesapMakinesi.toplama(v1,
                                                            v2);
                System.out.println("Toplama sonucu : " + toplamaLoc);
                break;
            case CIKARMA_INDEXI:
                int cikarmaLoc = this.hesapMakinesi.cikarma(v1,
                                                            v2);
                System.out.println("Cikarma sonucu : " + cikarmaLoc);
                break;
            case CARPMA_INDEXI:
                int carpmaLoc = this.hesapMakinesi.carpma(v1,
                                                          v2);
                System.out.println("Carpma sonucu : " + carpmaLoc);
                break;
            case BOLME_INDEXI:
                int bolmeLoc = this.hesapMakinesi.bolme(v1,
                                                        v2);
                System.out.println("Bolme sonucu : " + bolmeLoc);
                break;
            default:
                break;
        }
    }
}
