package com.innova.java.training.javaobject;


public class MyFirstClass {

    private String name;
    private String surname;

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

    @Override
    public String toString() {
        return "[name=" + name + ", surname=" + surname + "]";
    }


}
