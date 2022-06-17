package de.leetcode.romantoint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    private RomanToInteger romanToInteger = new RomanToInteger();

    public static Object[][] numbersProvider() {

        return new Object[][] {
                { "III", 3 },
                { "VII", 7 },
                { "IV", 4 },
                { "MCMXCIV", 1994 },
                { "LVIII", 58 },
                { "MMMDCCCXXV", 3825 }
        };
    }

    @Test
    public void testValues() {

        Object[][] values = numbersProvider();

        for (Object[] o : values) {

            int result = romanToInteger.romanToInt((String) o[0]);
            assertEquals(o[1], result);
        }
    }

}