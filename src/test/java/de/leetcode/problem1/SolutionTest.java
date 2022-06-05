package de.leetcode.problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    public void testSolution() {

        int[] nums = {13, 8, 7, 11, 23, 89, 22, 40, 68, 1, 34};
        var target = 63;

        assertArrayEquals(new int[]{4, 7}, solution.twoSum(nums, target));
    }

    @Test
    public void testSolutionNotSameElementTwice() {
        int[] nums = {13, 8, 7, 11, 23, 89, 22, 40, 68, 1, 34};
        var target = 44;

        assertArrayEquals(new int[0], solution.twoSum(nums, target));

    }
}