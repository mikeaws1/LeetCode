package de.leetcode.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UtilTest {
    

    @Test
    public void powerTest() {
        assertEquals(1000, Util.power(3));
        assertEquals(100, Util.power(2));
        assertEquals(1, Util.power(0));
    }
}
