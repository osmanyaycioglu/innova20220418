package com.innova.java.training.obj.access;


public class AccessRun {

    public static void main(String[] args) {
        ObjectMemberAccess oma = new ObjectMemberAccess();
        oma.intVal = 100;
        oma.strVal = "osman";
        oma.hello("ali");
        oma.longObjVal = 100L;
        oma.doubleVal = 10.34;
    }
}
