package de.leetcode.util;

public class Util {
    
    public static int power(int exp) {

       int power = 1;

       for (int i = 0; i < exp; i++) {
            power = power * 10;
       }

       return power;
    }

    public static ListNode createListReverse(int[] values) {

        final ListNode start = new ListNode(values[0]);
        ListNode old = start;

        for (int i = 1; i < values.length; i++) {

            ListNode node = new ListNode(values[i], old);
            old = node;
        }

        return old;
    }

    public static ListNode createList(int[] values) {

        int l = values.length - 1;
        final ListNode start = new ListNode(values[l]);
        ListNode old = start;

        for (int i = l - 1; i >= 0; i--) {

            ListNode node = new ListNode(values[i], old);
            old = node;
        }

        return old;
    }
}
