package de.leetcode.swappairs;

import de.leetcode.util.ListNode;
import de.leetcode.util.ListNodeComparator;
import org.junit.jupiter.api.Test;

import static de.leetcode.util.Util.createList;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SwapPairsTest {


    private final int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final int[] result = {2, 1, 4, 3, 6, 5, 8, 7, 9};

    private final SwapPairs swapPairs = new SwapPairs();


    @Test
    void test() {

        final ListNode input = createList(values);
        ListNode resultNodeList = swapPairs.swapPairs(input);

        assertTrue(ListNodeComparator.compare(resultNodeList, result));

    }

}