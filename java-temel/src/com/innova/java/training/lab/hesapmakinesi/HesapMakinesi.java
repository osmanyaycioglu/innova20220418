package com.innova.java.training.lab.hesapmakinesi;


public class HesapMakinesi {

    public int toplama(int val1,
                       int val2) {
        return val1 + val2;
    }

    public int cikarma(int val1,
                       int val2) {
        return val1 - val2;
    }

    public int carpma(int val1,
                      int val2) {
        return val1 * val2;
    }

    public int bolme(int val1,
                     int val2) {
        if (val2 == 0) {
            return 0;
        }
        return val1 / val2;
    }

}
