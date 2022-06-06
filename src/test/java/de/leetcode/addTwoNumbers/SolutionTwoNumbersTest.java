package de.leetcode.addTwoNumbers;

import static org.apache.commons.lang3.ArrayUtils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTwoNumbersTest {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    private SolutionTwoNumbers solutionTwoNumbers = new SolutionTwoNumbers();


    @Test
    public void testAddNumbers() {

        final ListNode list1 = createList(new int[]{4, 9, 3});
        final ListNode list2 = createList(new int[]{4, 2, 8});

        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        int[] result = new int[]{9, 2, 1};

        assertResult(node, result);
    }

    private void assertResult(ListNode start, int[] result) {

        int i = 0;

        reverse(result);
        while (start.next != null) {
            assertEquals(result[i], start.number);
            start = start.next;
            i++;
        }
    }

    private ListNode createList(int[] values) {

        ListNode start = new ListNode(values[0]);
        ListNode old = start;

        for (int i = 1; i < values.length; i++) {

            ListNode node = new ListNode(values[i], old);
            old = node;
        }

        return old;
    }
}