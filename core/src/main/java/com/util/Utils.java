package com.util;

import com.task.StringUtils;

public class Utils {
    static public boolean isAllPositiveNumbers(String... numbers) {
        StringUtils stringUtils = new StringUtils();
        for (String number : numbers) {
            try {
                if (!stringUtils.isPositiveNumber(number)) return false;
            } catch (NumberFormatException e) {
                throw new NumberFormatException();
            }
        }
        return true;
    }
}
