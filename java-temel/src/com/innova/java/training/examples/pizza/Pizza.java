package com.innova.java.training.examples.pizza;


public class Pizza {

    private String malzeme1;
    private String malzeme2;
    private String malzeme3;


    public Pizza(final String malzeme1) {
        this.malzeme1 = malzeme1;
    }

    public Pizza(final String malzeme1,
                 final String malzeme2) {
        this.malzeme1 = malzeme1;
        this.malzeme2 = malzeme2;
    }

    public Pizza(final String malzeme1,
                 final String malzeme2,
                 final String malzeme3) {
        this.malzeme1 = malzeme1;
        this.malzeme2 = malzeme2;
        this.malzeme3 = malzeme3;
    }

    public void showIng() {
        System.out.println("Malzeme1 : "
                           + this.malzeme1
                           + " malzeme2 : "
                           + this.malzeme2
                           + " malzeme3 : "
                           + this.malzeme3);
    }

    public String getMalzeme1() {
        return this.malzeme1;
    }

    public void setMalzeme1(final String malzeme1Param) {
        this.malzeme1 = malzeme1Param;
    }

    public String getMalzeme2() {
        return this.malzeme2;
    }

    public void setMalzeme2(final String malzeme2Param) {
        this.malzeme2 = malzeme2Param;
    }

    public String getMalzeme3() {
        return this.malzeme3;
    }

    public void setMalzeme3(final String malzeme3Param) {
        this.malzeme3 = malzeme3Param;
    }


}
