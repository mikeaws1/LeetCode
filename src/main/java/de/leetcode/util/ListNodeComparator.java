package de.leetcode.util;


public class ListNodeComparator {

    public static int compare(ListNode head, int[] values) {
        int ret = 0;

        for (int i : values) {

            ret = Integer.compare(head.number, i);
            head = head.next;

            if (head == null) {
                break;
            }
        }
        return ret;
    }
}