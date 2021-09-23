package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    public void testIsAllPositiveNumberShouldReturnTrueWhenPositiveNumbersApplied() {
        boolean actual = Utils.isAllPositiveNumbers("12","79","14");
        assertTrue(actual);
    }

    @Test
    public void testIsAllPositiveNumberShouldReturnFalseWhenNegativeNumbersApplied() {
        boolean actual = Utils.isAllPositiveNumbers("12","79","-14");
        assertFalse(actual);
    }

    @Test
    public void testIsAllPositiveNumberShouldReturnFalseWhenNotNumbersApplied() {
        boolean actual = Utils.isAllPositiveNumbers("asd","79","14");
        assertFalse(actual);
    }

    @Test
    public void testIsAllPositiveNumberShouldReturnFalseWhenNumbersNotApplied() {
        boolean actual = Utils.isAllPositiveNumbers();
        assertFalse(actual);
    }

    @Test
    public void testIsAllPositiveNumberShouldReturnFalseWhenNullApplied() {
        boolean actual = Utils.isAllPositiveNumbers(null);
        assertFalse(actual);
    }
}