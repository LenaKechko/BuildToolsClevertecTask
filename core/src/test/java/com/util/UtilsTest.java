package com.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class UtilsTest {

    @Test
    void isAllPositiveNumberTrue() {
        assertTrue(Utils.isAllPositiveNumbers("10", "3"));
        assertTrue(Utils.isAllPositiveNumbers("15"));
        assertTrue(Utils.isAllPositiveNumbers("66", "1", "159"));
    }
    @Test
    void isNotAllPositiveNumberTrue() {
        assertFalse(Utils.isAllPositiveNumbers("17", "-2"));
        assertFalse(Utils.isAllPositiveNumbers("-6", "78"));
        assertFalse(Utils.isAllPositiveNumbers("-54", "-2", "-3"));
    }

    @Test
    void isAllPositiveNumberThrow() {
        assertThrows(NumberFormatException.class, () -> Utils.isAllPositiveNumbers("w"));
    }
}