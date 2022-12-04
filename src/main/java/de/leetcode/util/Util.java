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

        ListNode old = new ListNode(values[0]);

        for (int i = 1; i < values.length; i++) {
            old = new ListNode(values[i], old);
        }

        return old;
    }

    public static ListNode createList(int[] values) {

        int l = values.length - 1;
        ListNode old = new ListNode((values[l]));

        for (int i = l - 1; i >= 0; i--) {
            old= new ListNode(values[i], old);
        }

        return old;
    }
}
