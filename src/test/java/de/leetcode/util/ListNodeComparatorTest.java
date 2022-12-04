package de.leetcode.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeComparatorTest {


    @Test
    public void test() {
        final int[] values = new int[] {3, 8, 19, 4, 222, 21};
        final ListNode list = Util.createList(values);

        assertTrue(ListNodeComparator.compare(list, values));

    }

    @Test
    public void test_2() {
        final int[] values = new int[] {3, 8, 19, 4, 222, 21};
        final int[] wrongResult = new int[] {3, 8};
        final ListNode list = Util.createList(values);

        assertFalse(ListNodeComparator.compare(list, wrongResult));

    }

}