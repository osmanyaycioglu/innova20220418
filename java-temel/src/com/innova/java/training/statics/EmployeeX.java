package com.innova.java.training.statics;


public class EmployeeX {

    private String name;
    private String surname;

    private EmployeeX() {
    }

    public static EmployeeX createEmployeeX() {
        return new EmployeeX();
    }

    public static EmployeeX createDefaultEmployeeX() {
        EmployeeX employeeXLoc = new EmployeeX();
        employeeXLoc.setName("default");
        return employeeXLoc;
    }

    public String getName() {
        return this.name;
    }

    public EmployeeX setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public EmployeeX setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

}
