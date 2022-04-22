package com.innova.java.training.lab.hesapmakinesi.oo;

public class OOCalculatorRun {

    public static void main(final String[] args) {
        IOOCalculator calculatorLoc = new StandartOOCalculator();
        calculatorLoc.showMenu();
        calculatorLoc.runCalculateElement(calculatorLoc.chooseMenuItem());
    }
}
