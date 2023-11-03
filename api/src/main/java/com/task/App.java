package com.task;

import com.util.Utils;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println(Utils.isAllPositiveNumbers(args));
        } catch (NumberFormatException e) {
            System.out.println("Incorrect data. Only numbers");
        }
    }
}