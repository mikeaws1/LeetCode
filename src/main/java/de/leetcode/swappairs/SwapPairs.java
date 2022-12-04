package de.leetcode.swappairs;

import de.leetcode.util.ListNode;

public class SwapPairs {


    public ListNode swapPairs(ListNode head) {

        if (head == null)
            return null;

        final ListNode next = head.next;

        if (next == null)
            return null;

        final ListNode tmp = next.next;

        next.next = head;
        head.next = tmp;
        swapPairs(head);

        return tmp;
    }
}
