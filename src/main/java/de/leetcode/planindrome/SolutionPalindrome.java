package de.leetcode.planindrome;

public class SolutionPalindrome {

    boolean isPalindrome(int s) {

        String r = String.valueOf(s);
        char[] chars = r.toCharArray();

        int j = chars.length - 1;

        for (int i = 0; i < chars.length; i++){
            if (chars[i] != chars[j]){
                return false;
            }
            j--;
            if (j< i) {
                break;
            }
        }
        return true;
    }
}
