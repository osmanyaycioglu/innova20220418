package com.innova.java.training.obj.access;


public class ObjectMemberAccess {

    public int      intVal;
    private long    longVal;
    public String   strVal;
    private Integer intObjVal;
    protected Long  longObjVal;
    Double          doubleVal;

    public ObjectMemberAccess() {
    }

    public String hello(String name) {
        String greetLoc = greet(name);
        return "Hello " + name;
    }

    private String greet(String name) {
        return "Greetings " + name;
    }

}
