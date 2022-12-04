package de.leetcode.swappairs;

import de.leetcode.util.ListNode;

public class SwapPairs {


    public ListNode swapPairs(ListNode head) {


        if (head == null) return null;
        final ListNode tmp = head.next;
        if (tmp == null) return null;
        final ListNode tmpNext = tmp.next;

        tmp.next = head;
        head.next = tmpNext;


        swapPairs(tmpNext);

        return tmp;
    }
}
