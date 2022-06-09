package de.leetcode.addtwonumbers;

import static org.apache.commons.lang3.ArrayUtils.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTwoNumbersTest {

    private final SolutionTwoNumbers solutionTwoNumbers = new SolutionTwoNumbers();


    @Test
    void testAddNumbers() {

        final ListNode list1 = createList(new int[]{4, 9, 3});
        final ListNode list2 = createList(new int[]{4, 2, 8});

        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        int[] result = new int[]{9, 2, 1};

        assertResult(node, result);
    }

    @Test
    public void testAddNumbersUnequalLength() {

        final ListNode list1 = createList(new int[]{4, 9, 3});
        final ListNode list2 = createList(new int[]{8, 2, 4, 2, 8});

        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        int[] result = new int[]{8,2, 9, 2, 1};

        assertResult(node, result);
    }

    private void assertResult(ListNode start, int[] result) {

        int i = 0;

        reverse(result);
        while (start != null) {
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