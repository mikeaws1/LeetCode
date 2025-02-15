package de.leetcode.rotatelist;

import de.leetcode.util.ListNode;

public class SolutionRotateList {


    private ListNode head;

    public ListNode rotateRight(ListNode head, int k) {

        int length = length(head);
        if (length == 0 || length == 1)
            return head;

        int rm = k % length;

        if (rm == 0 || length == rm) {
            return head;
        }

        compute(head, head, rm + 1);
        return this.head;
    }




    int length(ListNode head) {
        if (head == null) return 0;
        return 1 + length(head.next);
    }

    private int compute(ListNode head, ListNode tmp, int k) {


        if (tmp.next == null) {
            tmp.next = head;
            this.head = tmp;
            return (k - 1);
        }

        int v = compute(head, tmp.next, k);

        if (v == 1) {
            tmp.next = null;
            return 0;
        }

        if (v == 0) {
            return 0;
        } else {
            this.head = tmp;
            return (v - 1);
        }
    }
}
