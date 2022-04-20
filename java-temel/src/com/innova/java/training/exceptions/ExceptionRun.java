package com.innova.java.training.exceptions;

import com.innova.java.training.enums.Person;
import com.innova.java.training.statics.StringUtils;

public class ExceptionRun {

    public static void main(final String[] args) {
        Person personLoc = null;
        ExceptionRun runLoc = new ExceptionRun();
        try {
            runLoc.method1(personLoc,
                           "osman");
        } catch (NullPointerException eLoc) {
            System.out.println("Null problemi oluştu");
        } catch (IllegalArgumentException eLoc) {
            System.out.println("Parametrede problem oluştu");
        } catch (MyUserException eLoc) {
            System.out.println("User Exp geldi : " + eLoc.getMessage());
        } catch (Exception eLoc) {
            System.out.println("Beklemediğim birşey oldu");
        }
        System.out.println("İşlem bitti");

        try {
            runLoc.method1(personLoc,
                           null);
        } catch (MyUserException e) {
            e.printStackTrace();
        }
    }

    public void method1(final Person person,
                        final String str) throws MyUserException {
        this.method2(person,
                     str);
        System.out.println("Method1 döndü");
    }

    public void method2(final Person person,
                        final String str) throws MyUserException {

        try {
            this.method3(person,
                         str);
        } catch (Exception e) {
            System.out.println("Error oluştu : " + e.getMessage());
        }
        System.out.println("Method2 döndü");

    }

    public void method3(final Person person,
                        final String str) throws MyUserException, ParamException {
        if (person == null) {
            throw new MyUserException("Person null olamaz");
        }
        if (StringUtils.isEmpty(str)) {
            throw new ParamException("str null olamaz");
        }
        person.setName(str);
        System.out.println("Method3 döndü");
    }

}
