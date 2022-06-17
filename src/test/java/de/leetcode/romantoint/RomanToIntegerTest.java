package de.leetcode.romantoint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    public RomanToInteger romanToInteger = new RomanToInteger();
	
    @Test
    public void testValue() {


        String value = "III";

        int result = romanToInteger.romanToInt(value);

        assertEquals(3, result);
    }

    @Test
    public void testValue2() {

        String value = "VII";

        int result = romanToInteger.romanToInt(value);

        assertEquals(7, result);
    }

    @Test
    public void testValue3() {

        String value = "IV";

        int result = romanToInteger.romanToInt(value);

        assertEquals(4, result);
    }

    @Test
    public void testValue4() {

        String value = "MCMXCIV";

        int result = romanToInteger.romanToInt(value);

        assertEquals(1994, result);
    }

    @Test
    public void testValue5() {

        String value = "LVIII";

        int result = romanToInteger.romanToInt(value);

        assertEquals(58, result);
    }
}