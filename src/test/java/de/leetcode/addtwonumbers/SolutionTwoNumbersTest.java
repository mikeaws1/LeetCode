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
    public void testAddNumbersUnequalLength() {

        final ListNode list1 = Util.createListReverse(new int[]{4, 9, 3});
        final ListNode list2 = Util.createListReverse(new int[]{8, 2, 4, 2, 8});

        ListNode node = solutionTwoNumbers.addTwoNumbers(list1, list2);
        int[] result = new int[]{8, 2, 9, 2, 1};

        assertResult(node, result);
    }

    private void assertResult(ListNode start, int[] result) {

        reverse(result);
        assertEquals(0, ListNodeComparator.compare(start, result));
    }

}