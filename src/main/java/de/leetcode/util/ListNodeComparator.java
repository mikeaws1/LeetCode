package de.leetcode.util;


public class ListNodeComparator {

    public static int compare(ListNode head, int[] values) {
        int ret = 0;

        for (int i : values) {

            if (i == head.number) {
                ret = 0;
            } else if (i > head.number) {
                ret = -1;
            } else if (i < head.number) {
                ret = 1;
            }
            head = head.next;

            if (head == null) {
                break;
            }
        }
        return ret;
    }
}