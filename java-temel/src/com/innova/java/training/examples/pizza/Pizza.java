package com.innova.java.training.examples.pizza;


public class Pizza {

    private String malzeme1;
    private String malzeme2;
    private String malzeme3;


    public Pizza(String malzeme1) {
        this.malzeme1 = malzeme1;
    }

    public Pizza(String malzeme1,
                 String malzeme2) {
        this.malzeme1 = malzeme1;
        this.malzeme2 = malzeme2;
    }

    public Pizza(String malzeme1,
                 String malzeme2,
                 String malzeme3) {
        this.malzeme1 = malzeme1;
        this.malzeme2 = malzeme2;
        this.malzeme3 = malzeme3;
    }

    public void showIng() {
        System.out.println("Malzeme1 : " + malzeme1 + " malzeme2 : " + malzeme2 + " malzeme3 : " + malzeme3);
    }

    public String getMalzeme1() {
        return malzeme1;
    }

    public void setMalzeme1(String malzeme1Param) {
        malzeme1 = malzeme1Param;
    }

    public String getMalzeme2() {
        return malzeme2;
    }

    public void setMalzeme2(String malzeme2Param) {
        malzeme2 = malzeme2Param;
    }

    public String getMalzeme3() {
        return malzeme3;
    }

    public void setMalzeme3(String malzeme3Param) {
        malzeme3 = malzeme3Param;
    }


}
