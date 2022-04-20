package com.innova.java.training.arrays;

import com.innova.java.training.examples.pizza.Student;

public class ArrayRun {

    public static void main(String[] args) {
        int a = 10;
        int b[] = new int[6];
        b[0] = 1;
        b[1] = 10;
        b[2] = 11;
        b[3] = 30;
        b[4] = 80;
        b[5] = 90;
        Student[] students = new Student[3];

        for (int iLoc = 0; iLoc < students.length; iLoc++) {
            System.out.println(students[iLoc]);
        }
        students[0] = new Student("osman",
                                  "yaycıoğlu",
                                  "8713009",
                                  "1",
                                  200);
        String gradeLoc = students[0].getGrade();
        students[1] = new Student("ali",
                                  "telas",
                                  "8713010",
                                  "1",
                                  180);
        students[2] = new Student("veli",
                                  "ulaş",
                                  "8713011",
                                  "1",
                                  160);
        Student[] students2 = new Student[4];
        System.arraycopy(students,
                         0,
                         students2,
                         0,
                         3);

        System.out.println("---------------------");
        for (int iLoc = 0; iLoc < students.length; iLoc++) {
            System.out.println(students[iLoc]);
        }
    }
}
