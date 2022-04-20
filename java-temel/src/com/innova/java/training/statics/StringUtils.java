package com.innova.java.training.statics;


public class StringUtils {

    public static boolean isEmpty(final String str) {
        return (str == null) || str.isEmpty();
    }

    public static boolean isNotEmpty(final String str) {
        return (str != null) && !str.isEmpty();
    }

}
