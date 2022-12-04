package de.leetcode.util;

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
}
