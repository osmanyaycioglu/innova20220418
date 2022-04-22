package com.innova.java.training.lab.hesapmakinesi.oo;

import java.util.Arrays;

public class StandartOOCalculator extends AbstractOOCalculator {

    public StandartOOCalculator() {
        super(Arrays.asList(new ToplamaCalculateElement(),
                            new CikarmaCalculateElement(),
                            new CarpmaCalculateElement(),
                            new BolmeCalculateElement()));
    }

}
