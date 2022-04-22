package com.innova.java.training.lab.hesapmakinesi.oo;

import java.util.Scanner;

public abstract class AbstractCalculateElement implements ICalculateElement {

    public Parameters getParams(final Scanner scanner,
                                final int parameterCount) {
        Parameters parametersLoc = new Parameters();
        for (int iLoc = 0; iLoc < parameterCount; iLoc++) {
            System.out.println((iLoc + 1) + ".parametreyi gir : ");
            double nextDoubleLoc = scanner.nextDouble();
            parametersLoc.addParameter(nextDoubleLoc);
        }
        return parametersLoc;
    }

}
