package de.leetcode.util;


public class ListNodeComparator {

    public static boolean compare(ListNode head, int[] values) {
        boolean ret = true;

        Integer[] ints = head.toArray();

        if (ints.length != values.length) {
            return false;
        }

        for (int i : values) {
            ret &= (head.number == i);
            head = head.next;

            if (head == null) {
                break;
            }
        }
        return ret;
    }
}