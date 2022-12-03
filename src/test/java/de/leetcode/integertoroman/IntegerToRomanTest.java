package de.leetcode.integertoroman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    private final IntegerToRoman integerToRoman = new IntegerToRoman();

    private Object[][] data() {
        return new Object[][] {
                { 3, "III" },
                { 4, "IV" },
                { 58, "LVIII" },
                { 1984, "MCMLXXXIV"},
                { 3825, "MMMDCCCXXV" }
        };
    }

    @Test
    public void testIntToRoman() {

        for (Object[] o : data()) {

            final String s = integerToRoman.intToRoman((Integer) o[0]);
            assertEquals(o[1], s);
        }
    }
}
