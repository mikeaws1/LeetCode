package de.leetcode.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNode implements Comparable<ListNode> {

    public int number;
    public ListNode next;

    public ListNode(int value, ListNode next) {
        this.number = value;
        this.next = next;

    }

    public ListNode(int value) {
        this(value, null);
    }

    @Override
    public int compareTo(ListNode node) {
        if (node.number == this.number) {
            return 0;
        }
        if (node.number < this.number) {
            return -1;
        }
        return 1;
    }


    public Integer[] toArray(List<Integer> integers) {

        integers.add(this.number);
        if (next != null) {
            next.toArray(integers);
        }
        Integer[] values = integers.toArray(new Integer[0]);

        return values;
    }
}
