package com.innova.java.training.lab.hesapmakinesi.oo;

import java.util.Scanner;

public class CarpmaCalculateElement extends AbstractCalculateElement {

    @Override
    public String desc() {
        return "Çarpma";
    }

    @Override
    public double calculate(final Scanner scannerParam) {
        Parameters paramsLoc = this.getParams(scannerParam,
                                              2);
        return paramsLoc.getParameters()
                        .get(0)
               * paramsLoc.getParameters()
                          .get(1);
    }

}
