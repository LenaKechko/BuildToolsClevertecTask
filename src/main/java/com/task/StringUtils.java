package com.task;

import java.util.Arrays;

public class StringUtils {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        Arrays.stream(args)
                .forEach(arg ->
                        System.out.printf("%s - %s\n", arg, stringUtils.isPositiveNumber(arg)));
    }

    boolean isPositiveNumber(String str) {
        return Integer.parseInt(str) > 0;
    }
}
