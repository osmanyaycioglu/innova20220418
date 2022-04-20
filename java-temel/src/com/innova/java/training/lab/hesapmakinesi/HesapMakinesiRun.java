package com.innova.java.training.lab.hesapmakinesi;


public class HesapMakinesiRun {

    public static void main(String[] args) {
        HesapMakinesiMenu menuLoc = new HesapMakinesiMenu();
        while (true) {
            menuLoc.menuGoster();
            int secimYapLoc = menuLoc.secimYap();
            if (secimYapLoc > 0 && secimYapLoc < 5) {
                menuLoc.islemYap(secimYapLoc);
            } else {
                System.out.println("Lütfen 1 ile 4 arasında giriş yapınız.");
                break;
            }
        }
    }
}
