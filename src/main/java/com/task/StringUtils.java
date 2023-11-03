package com.task;

import java.util.Arrays;

public class StringUtils {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();

        try {
            Arrays.stream(args)
                    .forEach(arg ->
                            System.out.printf("%s - %s\n", arg, stringUtils.isPositiveNumber(arg)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public boolean isPositiveNumber(String str) {
        try {
            return Integer.parseInt(str) > 0;
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }
}
