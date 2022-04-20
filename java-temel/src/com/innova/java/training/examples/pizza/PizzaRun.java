package com.innova.java.training.examples.pizza;


public class PizzaRun {

    public static void main(String[] args) {
        //        Pizza pizzaLoc = new Pizza();
        //        pizzaLoc.setMalzeme1("mantar");
        //        pizzaLoc.setMalzeme2("sucuk");
        //        pizzaLoc.showIng();
        //
        //        Pizza myPizza = new Pizza();
        //        myPizza.showIng();

        Pizza pizzaLoc = new Pizza("mantar",
                                   "sucuk");
        pizzaLoc.showIng();

        Pizza myPizza = new Pizza("mısır");
        myPizza.showIng();

        Pizza a = new Pizza("peynir",
                            "domates",
                            "sucuk");
        a.showIng();
    }
}
