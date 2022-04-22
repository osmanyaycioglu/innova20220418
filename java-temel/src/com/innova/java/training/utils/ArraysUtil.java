package com.innova.java.training.utils;

import java.util.Arrays;
import java.util.List;

import com.innova.java.training.oo.polymorphism.Bird;
import com.innova.java.training.oo.polymorphism.Cat;
import com.innova.java.training.oo.polymorphism.Dog;
import com.innova.java.training.oo.polymorphism.IAnimal;

public class ArraysUtil {

    public static void main(final String[] args) {
        List<IAnimal> animalListLoc = Arrays.asList(new Bird(),
                                                    new Cat(),
                                                    new Dog());
    }
}
