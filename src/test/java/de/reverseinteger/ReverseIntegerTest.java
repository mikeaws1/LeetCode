package de.reverseinteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.leetcode.reverseinteger.ReverseInteger;

public class ReverseIntegerTest {
    
    private final ReverseInteger reverseinteger = new ReverseInteger();

    @Test
    public void reverseIntTest() {

        int x = 872745;
        int result = reverseinteger.reverse(x);
        assertEquals(547278, result);
    }

    @Test
    public void reverseIntTest2() {

        int x = 2;
        int result = reverseinteger.reverse(x);
        assertEquals(2, result);
    }

    @Test
    public void reverseIntTestRemoveLeadingZeros() {

        int x = 120;
        int result = reverseinteger.reverse(x);
        assertEquals(21, result);
    }
}
