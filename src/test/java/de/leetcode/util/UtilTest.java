package de.leetcode.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UtilTest {

    static Stream<int[]> getValues() {
        return Stream.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4});
    }

    @ParameterizedTest
    @MethodSource("getValues")
    public void test_listnode(int[] values) {

        ListNode head =  Util.createList(values);

        assertEquals(0, ListNodeComparator.compare(head, values) );
    }

    @Test
    public void powerTest() {
        assertEquals(1000, Util.power(3));
        assertEquals(100, Util.power(2));
        assertEquals(1, Util.power(0));
    }
}
