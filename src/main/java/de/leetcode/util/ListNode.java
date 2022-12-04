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
        return Integer.compare(this.number, node.number);
    }

    public int[] toArray() {
        return Arrays.stream(toArray(new ArrayList<>())).mapToInt(Integer::intValue).toArray();
    }

    private Integer[] toArray(List<Integer> integers) {

        integers.add(this.number);
        if (next != null) {
            next.toArray(integers);
        }
        return integers.toArray(new Integer[0]);
    }
}
