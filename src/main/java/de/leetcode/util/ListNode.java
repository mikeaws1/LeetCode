package de.leetcode.util;

public class ListNode {

    public int number;
    public ListNode next;

    public ListNode(int value, ListNode next) {
        this.number = value;
        this.next = next;

    }

    public ListNode(int value) {
        this(value, null);
    }

}
