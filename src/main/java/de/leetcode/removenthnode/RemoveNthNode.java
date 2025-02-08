package de.leetcode.removenthnode;

import de.leetcode.util.ListNode;

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = count(head);
        ListNode node = head;
        int l = length - n;

        if (l == 0)
            return head.next;

        while (l > 1) {
            node = head.next;
            l--;
        }

        if (node.next != null) {
            node.next = node.next.next;
        } else {
            head = null;
        }

        return head;
    }

    private int count(ListNode head) {
        if (head == null) return 0;
        return 1 + count(head.next);
    }
}
