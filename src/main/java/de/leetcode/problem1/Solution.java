package de.leetcode.problem1;

import java.util.Arrays;

public class Solution {

    public long[] twoSum(long[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new long[] { i, j };
                }
            }
        }
        // Should not be reached
        return new long[0];
    }

    public long[] twoSumLogN(long[] nums, int target) {

        final int pivot = nums.length / 2;

        if (nums.length == 1) {
            return new long[0];
        }
        if (nums.length == 2) {
            if (nums[0] + nums[1] == target) {
                return nums;
            }
            return new long[0];
        }

        for (int i = 0, j = nums.length - 1; i <= pivot; i++, j--) {
            long n1 = nums[i];
            long n2 = nums[j];

            if (n1 + n2 == target) {
                return new long[] { i, j };
            }
            nums[i] = n2;
            nums[j] = n1;
        }

        long[] a = twoSumLogN(Arrays.copyOfRange(nums, 0, pivot), target);
        long[] b = twoSumLogN(Arrays.copyOfRange(nums, pivot, nums.length + 1), target);

        if (a.length > 0) {
            return a;
        } else if (b.length > 0) {
            return b;
        }

        return new long[0];
    }

}
