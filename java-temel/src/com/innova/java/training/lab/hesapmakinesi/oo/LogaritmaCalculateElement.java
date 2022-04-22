package com.innova.java.training.lab.hesapmakinesi.oo;

import java.util.Scanner;

public class LogaritmaCalculateElement extends AbstractCalculateElement {

    @Override
    public String desc() {
        return "Logaritma";
    }

    @Override
    public double calculate(final Scanner scannerParam) {
        Parameters paramsLoc = this.getParams(scannerParam,
                                              1);
        return Math.log(paramsLoc.getParameters()
                                 .get(0));
    }

}
