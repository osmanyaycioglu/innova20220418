package com.innova.java.training.lab.hesapmakinesi.oo;

import java.util.Arrays;

public class BilimselOOCalculator extends AbstractOOCalculator {

    public BilimselOOCalculator() {
        super(Arrays.asList(new ToplamaCalculateElement(),
                            new CikarmaCalculateElement(),
                            new CarpmaCalculateElement(),
                            new BolmeCalculateElement(),
                            new CarpmaUcluCalculateElement(),
                            new LogaritmaCalculateElement()));
    }

}
