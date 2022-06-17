package de.leetcode.mediansortedarrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionMedianSortedArraysTest {

    private final SolutionMedianSortedArrays solutionMedianSortedArrays = new SolutionMedianSortedArrays();

    @Test
    void testMedian() {
        int[] a1 = new int[]{1,2,3,4};
        int[] a2 = new int[]{7,8,9};

        double median = solutionMedianSortedArrays.findMedianSortedArrays(a1, a2);

        assertEquals(4, median);

    }

    @Test
    void testMedianUneven() {
        int[] a1 = new int[]{1,2,3};
        int[] a2 = new int[]{7,8,9};

        double median = solutionMedianSortedArrays.findMedianSortedArrays(a1, a2);

        assertEquals(5, median);

    }


}