package de.leetcode.planindrome;

public class SolutionPalindrome {

    boolean isPalindrome(int s) {

        String r = String.valueOf(s);
        char[] chars = r.toCharArray();
        int j = chars.length - 1;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[j]) {
                return false;
            }
            j--;
            if (j < i) {
                break;
            }
        }
        return true;
    }


    public boolean isPalindrome2(int x) {

        int newValue = 0;
        int savedX = x;
        int j = 0;
        int i = l - 1;

        for (; i >= 0; i--) {
            int p = POWERS_OF_10[i];
            if (p <= x) {
                break;
            }
        }

        for (; i >= 0; i--) {

            int p = POWERS_OF_10[i];
            int val = x / p;
            x = x - (val * p);
            newValue += (val * POWERS_OF_10[j]);
            j++;
        }

        return newValue == savedX;
    }


    static final int[] POWERS_OF_10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    static final int l = POWERS_OF_10.length;
}
