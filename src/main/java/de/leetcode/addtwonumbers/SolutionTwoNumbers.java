package de.leetcode.addtwonumbers;


import de.leetcode.util.ListNode;

public class SolutionTwoNumbers {


    public ListNode addTwoNumbersIterativ(ListNode l1, ListNode l2) {
        ListNode firstIter;
        ListNode secondIter;
        ListNode result = null;
        ListNode resultList = null;

        if (length(l1, l2)) {
            firstIter = l1;
            secondIter = l2;
        } else {
            firstIter = l2;
            secondIter = l1;
        }

        int carry = 0;
        while (firstIter != null) {

            int number;
            if (secondIter != null) {
                number = firstIter.val + secondIter.val;
            } else {
                number = firstIter.val;
            }
            number += carry;

            if (result != null) {
                result.next = new ListNode(number %10);
                result = result.next;
            }
            else {
                resultList = result = new ListNode(number % 10);
            }

            carry = 0;
            if (number >= 10) {
                carry = 1;
            }

            firstIter = firstIter.next;
            if (secondIter != null) {
                secondIter = secondIter.next;
            }
        }
        if (carry == 1) {
            result.next = new ListNode(1);
        }

        return resultList;
    }

    private boolean length(ListNode start1, ListNode start2) {
        if (start2 == null) {
            return true;
        }

        while (start1 != null) {
            start1 = start1.next;
            if (start2 == null) {
                return true;
            }
            start2 = start2.next;
        }
        if (start2 != null) {
            return false;
        }
        return true;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersRecursive(l1, l2, 0);
    }

    public ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int carry){
       if (l1 == null && l2 == null)  {
           if (carry == 1) {
               return new ListNode(1);
           }
           else {
               return null;
           }
       }

       else if (l1 == null ) {
           int num = l2.val + carry;
           int c = num >= 10?1:0;
           return new ListNode(num % 10, addTwoNumbersRecursive(l2.next, null, c));
       }
       else if (l2 == null) {
           int num = l1.val + carry;
           int c = num >= 10?1:0;
           return new ListNode(num % 10, addTwoNumbersRecursive(null, l1.next, c));

       }

       int number = l1.val + l2.val + carry;
       int rest = number % 10;

       ListNode n = addTwoNumbersRecursive(l1.next, l2.next, number >= 10?1:0);

       return new ListNode(rest, n);
    }


}
