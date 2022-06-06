package de.leetcode.addTwoNumbers;

public class SolutionTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l2 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return new ListNode(l2.number, addTwoNumbers(null, l2.next));
        }
        if (l2 == null) {
            return new ListNode(l1.number, addTwoNumbers(l1.next, null));
        }

        final int l = l1.number + l2.number;
        int rest = l;

        int v = 0;
        if (l > 9) {
            rest  = l % 10;
            v = 1;
        }


        ListNode n = addTwoNumbers(l1.next, l2.next);
        if (n != null) {
            n.number += v;
        }
        return new ListNode(rest,  n);
    }
}
