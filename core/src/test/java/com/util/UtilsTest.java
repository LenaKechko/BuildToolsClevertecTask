package com.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isPositiveNumberTrue() {
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
}