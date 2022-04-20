package com.innova.java.training.statics;


public class EmployeeRun {

    public static void main(final String[] args) {
        // @formatter:off

                                             // ----> 0x080590 Employee.statisTest
        Employee.statisTest = "test string osman"; // ----> 0x080590 Employee.statisTest = "test string osman"
        Employee.staticMethod();
        Employee employee1 = new Employee(); // ----> 0x0f0090
                                             // name and surname alanı
        employee1.setName("osman");          // 0x0f0092 name (memory) = osman
        System.out.println(Employee.statisTest);
        Employee employee2 = new Employee(); // ----> 0x0f1077
                                             // name and surname alanı
        employee2.setName("ali");            // 0x0f1079 name (memory) = ali
        System.out.println(Employee.statisTest);
        System.out.println(Employee.statisTest);
        // @formatter:on
        EmployeeX employeeXLoc = EmployeeX.createEmployeeX()
                                          .setName("osman")
                                          .setSurname("yaycıoğlu");

        EmployeeX a = EmployeeX.createDefaultEmployeeX()
                               .setSurname("xyz");

    }
}
