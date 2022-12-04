package de.leetcode.util;


import java.util.ArrayList;
import java.util.List;

public class ListNodeComparator {

    public static boolean compare(ListNode head, int[] values) {
        boolean ret = true;
        List<Integer> v = new ArrayList<>();

       Integer[] ints = head.toArray(v);
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