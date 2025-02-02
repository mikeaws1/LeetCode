package de.leetcode.atoi;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionAtoiTest {


    private final SolutionAtoi solution = new SolutionAtoi();

    @Test
    void testVeryLong() {
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000522545459"));
    }

    @Test
    void testMMinOverlowo() {
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-9223372036854775809"));
    }

    @Test
    void testvaluePlusPlusWithLeadinSpace() {
        assertEquals(0, solution.myAtoi(" ++1"));
    }

    @Test
    void testvaluePlusPlus() {
        assertEquals(5, solution.myAtoi("+5+"));
    }

    @Test
    void testvalueMinusMinus() {
        assertEquals(-5, solution.myAtoi("-5-"));
    }

    @Test
    void testValueNoNumberString() {
        assertEquals(0, solution.myAtoi("NoNumber"));
    }

    @Test
    void testValueEmptyString() {
        assertEquals(0, solution.myAtoi(""));
    }

    @Test
    void testValueMinusPlus() {
        assertEquals(0, solution.myAtoi("-+12"));
    }

    @Test
    void testValuePlusMinus() {
        assertEquals(0, solution.myAtoi("+-12"));
    }

    @Test
    void testValuePlus() {
        assertEquals(1, solution.myAtoi("+1"));
    }

    @Test
    void testValue1() {
        assertEquals(0, solution.myAtoi("0-1"));
    }

    @Test
    void testValueCharacters() {
        assertEquals(0, solution.myAtoi("Words and 987"));
    }

    @Test
    void testValue() {
        assertEquals(42, solution.myAtoi("42"));
    }

    @Test
    void testSignLeadingZero() {
        assertEquals(-42, solution.myAtoi("-042"));
    }

    @Test
    void testSignLeadingZeroWhitespace() {
        assertEquals(-42, solution.myAtoi("    -042"));
    }

    @Test
    void testCharacter() {
        assertEquals(1337, solution.myAtoi("1337c0d3"));
    }


    @Test
    void testOverflowPositive() {
       assertEquals(Integer.MAX_VALUE, solution.myAtoi("91283472332"));
    }

    @Test
    void testOverflowPositive2() {
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("20000000000000000000"));
    }

    @Test
    void testOverflowPositive3() {
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("9223372036854775808"));
    }

    @Test
    void testOverflowNegative() {
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-91283472332"));
    }

}