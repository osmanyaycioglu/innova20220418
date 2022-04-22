package com.innova.java.training.lab.hesapmakinesi.oo;

import java.util.List;
import java.util.Scanner;

public abstract class AbstractOOCalculator implements IOOCalculator {

    private final List<ICalculateElement> calculatorElementList;
    private final Scanner                 scanner = new Scanner(System.in);

    public AbstractOOCalculator(final List<ICalculateElement> calculatorElementListParam) {
        this.calculatorElementList = calculatorElementListParam;
    }


    @Override
    public void showMenu() {
        for (int iLoc = 0; iLoc < this.calculatorElementList.size(); iLoc++) {
            System.out.println((iLoc + 1)
                               + "."
                               + this.calculatorElementList.get(iLoc)
                                                           .desc());
        }
    }

    @Override
    public int chooseMenuItem() {
        System.out.println("Seçiminiz : ");
        return this.scanner.nextInt();
    }

    @Override
    public void runCalculateElement(final int indexParam) {
        int realIndex = indexParam - 1;
        if ((realIndex >= 0) && (realIndex < this.calculatorElementList.size())) {
            ICalculateElement iCalculateElementLoc = this.calculatorElementList.get(realIndex);
            double calculateLoc = iCalculateElementLoc.calculate(this.scanner);
            System.out.println(iCalculateElementLoc.desc() + " için sonuç " + calculateLoc);
        }
    }

}
