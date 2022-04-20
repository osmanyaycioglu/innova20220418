package com.innova.java.training.enums;


public class EnumRun {

    public static void main(final String[] args) {
        RunStates statesLoc = RunStates.STOPPED;

        switch (statesLoc) {
            case BOOTING:
                break;
            case KILLED:
                break;
            case PAUSED:
                break;
            case RUNNING:
                break;
            case STOPPED:
                break;
            default:
                break;
        }
        int ordinalLoc = statesLoc.ordinal();
        String nameLoc = statesLoc.name();
        System.out.println("Index of Enum : " + ordinalLoc + " name : " + nameLoc);

        RunStates valueOfLoc = RunStates.valueOf("BOOTING");
        System.out.println("Enum : " + valueOfLoc);

        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yaycıoğlu");
        personLoc.setGender(EGender.MALE);
        personLoc.setGenderX(5);
        personLoc.setGenderY(Person.GENDER_MALE_STR);
        personLoc.setGenderY("ABC");

    }
}
