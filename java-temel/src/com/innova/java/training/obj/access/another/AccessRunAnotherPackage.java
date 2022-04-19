
package com.innova.java.training.obj.access.another;

import com.innova.java.training.obj.access.ObjectMemberAccess;

public class AccessRunAnotherPackage {

    public static void main(String[] args) {
        ObjectMemberAccess oma = new ObjectMemberAccess();
        oma.intVal = 100;
        oma.strVal = "osman";
        String helloLoc = oma.hello("osman");
        System.out.println(helloLoc);
    }
}
