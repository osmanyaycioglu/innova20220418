package com.innova.java.training.collections.list;

import java.util.ArrayList;

import com.innova.java.training.examples.pizza.Student;

public class ListRun {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(101);
        intList.add(102);
        for (int iLoc = 0; iLoc < 100; iLoc++) {
            intList.add(iLoc);
        }
        Integer thirdLoc = intList.get(2);
        System.out.println("Üçüncü eleman : " + thirdLoc);
        System.out.println("-----ALL-----------");
        for (int iLoc = 0; iLoc < intList.size(); iLoc++) {
            System.out.println((iLoc + 1) + ".eleman=" + intList.get(iLoc));
        }

        System.out.println("-----ALL with foreach-----------");
        for (Integer eleman : intList) {
            System.out.println(eleman);
        }
        //        Iterator<Integer> iteratorLoc = intList.iterator();
        //        while (iteratorLoc.hasNext()) {
        //            Integer nextLoc = iteratorLoc.next();
        //        }

        ArrayList<Student> students = new ArrayList<>();
    }
}
