package com.innova.java.training.statics;


public class Employee {

    public static String statisTest = "";

    private String       name;
    private String       surname;

    public void normalMethod() {
        statisTest = "normalMethod değiştirdi";
    }

    public static void staticMethod() {
        statisTest = "staticMethod değiştirdi";
    }

    public String getName() {
        return name;
    }

    public void setName(String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surnameParam) {
        surname = surnameParam;
    }

}
