package com.innova.java.training.lab.hesapmakinesi.oo;

import java.util.Scanner;

public class CarpmaUcluCalculateElement extends AbstractCalculateElement {

    @Override
    public String desc() {
        return "Üçlü Çarpma";
    }

    @Override
    public double calculate(final Scanner scannerParam) {
        Parameters paramsLoc = this.getParams(scannerParam,
                                              3);
        return paramsLoc.getParameters()
                        .get(0)
               * paramsLoc.getParameters()
                          .get(1)
               * paramsLoc.getParameters()
                          .get(2);
    }

}
