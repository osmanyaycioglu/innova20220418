package com.innova.java.training.examples.pizza;


public class Student extends Object {

    // Mandatory
    private String name;
    // Mandatory
    private String surname;
    // Mandatory
    private String studentId;
    // Optional
    private String grade;
    // Optional
    private int    height;


    public Student(String nameParam,
                   String surnameParam,
                   String studentIdParam) {
        name = nameParam;
        surname = surnameParam;
        studentId = studentIdParam;
    }


    public Student(String nameParam,
                   String surnameParam,
                   String studentIdParam,
                   String gradeParam,
                   int heightParam) {
        super();
        name = nameParam;
        surname = surnameParam;
        studentId = studentIdParam;
        grade = gradeParam;
        height = heightParam;
    }


    public void process() {
        System.out.println("Processing : " + name + " " + surname + " id : " + studentId);
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentIdParam) {
        studentId = studentIdParam;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String gradeParam) {
        grade = gradeParam;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int heightParam) {
        height = heightParam;
    }


    @Override
    public String toString() {
        return "Student [name="
               + name
               + ", surname="
               + surname
               + ", studentId="
               + studentId
               + ", grade="
               + grade
               + ", height="
               + height
               + "]";
    }

}
