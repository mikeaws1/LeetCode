package de.leetcode.addtwonumbers;

public class ListNode {

    int number;
    ListNode next;

    public ListNode(int number, ListNode next) {
        this.number = number;
        this.next = next;

    }

    public ListNode(int number) {
        this(number, null);
    }
}
