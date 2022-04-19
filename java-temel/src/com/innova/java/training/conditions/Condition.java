package com.innova.java.training.conditions;


public class Condition {

    public static void main(final String[] args) {
        int a = -100;

        if (a > 10) {
            System.out.println("A büyüktür 10 den");
        } else {
            System.out.println("A büyüktür 10 2. kısım");
            System.out.println("A büyüktür 10 else");
        }
        if (a > 20) {
            System.out.println("A büyüktür 20 den");
        }
        if (a > 50) {
            System.out.println("A büyüktür 50 den");
        }
        if (a >= 100) {
            System.out.println("A büyüktür 100 yada 100 ");
        }
        System.out.println("-------------------------------");
        if (a > 20) {
            System.out.println("A büyüktür 20 den");
        } else if (a > 50) {
            System.out.println("A büyüktür 50 den");
        } else if (a >= 100) {
            System.out.println("A büyüktür 100 yada 100 ");
        } else {
            System.out.println("hiç biri");
        }
        System.out.println("-------------------------------");
        if ((a > 10) && (a < 20)) {
            if (a == 13) {
                System.out.println("Uğursuz rakam");
            } else {
                System.out.println("A büyüktür 10 dan büyük 20 den küçük");
            }
        } else if (a == 20) {
            System.out.println("A 20 dir");
        } else if (((a > 10) || (a < 100)) && (a > 0)) {
            System.out.println("A 10 dan büyük yada 100 den küçük");
        } else if (a != -100) {
            System.out.println("A -100 değil");
        }
    }
}
