package com.innova.java.training.enums;


public class Person {

    public static final int    GENDER_MALE       = 1;
    public static final int    GENDER_FEMALE     = 2;
    public static final String GENDER_MALE_STR   = "MALE";
    public static final String GENDER_FEMALE_STR = "FEMALE";


    private String  name;
    private String  surname;
    private EGender gender;
    private int     genderX;
    private String  genderY;

    public String getGenderY() {
        return this.genderY;
    }

    public void setGenderY(final String genderYParam) {
        this.genderY = genderYParam;
    }

    public int getGenderX() {
        return this.genderX;
    }

    public void setGenderX(final int genderXParam) {
        this.genderX = genderXParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public EGender getGender() {
        return this.gender;
    }

    public void setGender(final EGender genderParam) {
        this.gender = genderParam;
    }

}
