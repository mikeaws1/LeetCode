package de.leetcode.swappairs;

import de.leetcode.util.ArrayPair;
import de.leetcode.util.ListNode;
import de.leetcode.util.ListNodeComparator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static de.leetcode.util.Util.createList;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SwapPairsTest {

    private final SwapPairs swapPairs = new SwapPairs();

    static Stream<ArrayPair<int[]>> generateValues() {
        return Stream.of(new ArrayPair<>(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{2, 1, 4, 3, 6, 5, 8, 7, 9}),
                new ArrayPair<>(new int[]{7, 8, 1, 3, 19, 82}, new int[]{8, 7, 3, 1, 82, 19}));
    }

    @ParameterizedTest
    @MethodSource("generateValues")
    void test_odd_list(ArrayPair<int[]> pair) {

        final ListNode input = createList(pair.input());
        ListNode resultNodeList = swapPairs.swapPairs(input);

        assertTrue(ListNodeComparator.compare(resultNodeList, pair.result()));

    }

}