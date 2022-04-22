package com.innova.java.training.lab.hesapmakinesi.oo;

import java.util.ArrayList;
import java.util.List;

public class Parameters {

    private final List<Double> parameters = new ArrayList<>();

    public void addParameter(final Double param) {
        this.parameters.add(param);
    }

    public List<Double> getParameters() {
        return this.parameters;
    }
}
