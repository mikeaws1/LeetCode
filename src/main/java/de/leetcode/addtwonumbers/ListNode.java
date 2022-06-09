package de.leetcode.addtwonumbers;

public class ListNode {

    int number;
    ListNode next;

    public ListNode(int value, ListNode next) {
        this.number = value;
        this.next = next;

    }

    public ListNode(int value) {
        this(value, null);
    }

}
