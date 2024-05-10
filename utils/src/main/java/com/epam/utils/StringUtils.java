package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean res = false;
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) != '-') {
                res = true;
            }
        }
        return res;
    }
}
