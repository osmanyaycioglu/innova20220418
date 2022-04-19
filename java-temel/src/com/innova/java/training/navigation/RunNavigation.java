package com.innova.java.training.navigation;


public class RunNavigation {

    public static void main(final String[] args) {
        Car c = new Car(); // Örnek 1
        Car z = new Car(); // Örnek 2
        z.avrgSpeed = 20; // Örnek 2 ye 20 koy
        c.avrgSpeed = 80; // Örnek 1 e 80 koy
        int s = c.goForward(160); // Örnek 1 goForward çağır
        z = c; // Örnek 1
        Car ornek2 = z; // Örnek 2
        Car ornek3 = z; // Örnek 2
        Car ornek4 = z; // Örnek 2
        Car ornek5 = z; // Örnek 2
        Car ornek6 = z; // Örnek 2
        Car ornek7 = z; // Örnek 2
        Car ornek8 = z; // Örnek 2
        z = new Car(); // Örnek 3
        z.avrgSpeed = 10;
        int forward = z.goForward(240); // Örnek 3 goFoward çağır
        int forward2 = ornek8.goForward(360);
        System.out.println("Araba 1 160 km giden araba " + s + " saat ileri gitmeli.");
        System.out.println("Araba 2 360 km giden araba " + forward2 + " saat ileri gitmeli.");
        System.out.println("Araba 3 240 km giden araba " + forward + " saat ileri gitmeli.");
    }
}
