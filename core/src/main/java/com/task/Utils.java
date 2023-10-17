package com.task;

public class Utils {
    static public boolean isAllPositiveNumbers(String... numbers) {
        StringUtils stringUtils = new StringUtils();
        for (String number : numbers) {
            if (!stringUtils.isPositiveNumber(number)) return false;
        }
        return true;
    }
}
