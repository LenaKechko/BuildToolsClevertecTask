package com.util;

import com.task.StringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StringUtilsTest {

    static StringUtils stringUtils = null;

    @BeforeAll
    static public void setUp() {
        stringUtils = new StringUtils();
    }

    @ParameterizedTest
    @ValueSource(strings = {"10", "5", "3", "900"})
    void isPositiveNumberTrue(String str) {
        assertTrue(stringUtils.isPositiveNumber(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1", "-100", "-14", "-65"})
    void isPositiveNumberFalse(String str) {
        assertFalse(stringUtils.isPositiveNumber(str));
    }
}