package de.leetcode.util;


import java.util.Arrays;

public class ListNodeComparator {

    public static boolean compare(ListNode head, int[] values) {

        int[] ints = head.toArray();
        var v = Arrays.compare(ints, values);

        return v == 0;
    }
}