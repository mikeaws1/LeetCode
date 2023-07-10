package de.leetcode.addtwonumbers;

import static org.apache.commons.lang3.ArrayUtils.*;
import static org.junit.jupiter.api.Assertions.*;

import de.leetcode.util.ListNode;
import de.leetcode.util.ListNodeComparator;
import de.leetcode.util.Util;
import org.junit.jupiter.api.Test;


class SolutionTwoNumbersTest {

    private final SolutionTwoNumbers solutionTwoNumbers = new SolutionTwoNumbers();


    @Test
    void testAddNumbers() {

        final ListNode list1 = Util.createListReverse(new int[]{4, 9, 3});
        final ListNode list2 = Util.createListReverse(new int[]{4, 2, 8});

        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        int[] result = new int[]{9, 2, 1};

        assertResult(node, result);
    }

    @Test
    void testAddNumbers3() {

        final ListNode list1 = Util.createListReverse(new int[]{1, 9, 9});
        final ListNode list2 = Util.createListReverse(new int[]{1});

        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        int[] result = new int[]{2, 0, 0};

        assertResult(node, result);
    }

    @Test
    void testAddNumbers2() {

        final ListNode list1 = Util.createListReverse(new int[]{9, 9, 9});
        final ListNode list2 = Util.createListReverse(new int[]{9, 9});

        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        int[] result = new int[]{1, 0, 9,8};

        assertResult(node, result);
    }

    @Test
    void testAddNumbers_9999() {

        final ListNode list1 = Util.createListReverse(new int[]{9,9,9,9,9,9,9});
        final ListNode list2 = Util.createListReverse(new int[]{9,9,9,9});

        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        //int[] result = new int[]{8,9,9,9,0,0,0,1};
        int[] result = new int[]{1, 0, 0, 0, 9, 9, 9, 8};
        assertResult(node, result);
    }

    @Test
    public void testAddNumbersUnequalLength() {

        final ListNode list1 = Util.createListReverse(new int[]{4, 9, 3});
        final ListNode list2 = Util.createListReverse(new int[]{8, 2, 4, 2, 8});

        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        int[] result = new int[]{8, 2, 9, 2, 1};

        assertResult(node, result);
    }

    @Test
    public void testAddNumbersLengthTwo() {
        final ListNode list1 = Util.createListReverse(new int[]{7, 3});
        final ListNode list2 = Util.createListReverse(new int[]{2, 9});
        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        int[] result = new int[]{1, 0, 2};

        assertResult(node, result);
    }

    private void assertResult(ListNode start, int[] result) {

        reverse(result);
        assertTrue(ListNodeComparator.compare(start, result));
    }

}