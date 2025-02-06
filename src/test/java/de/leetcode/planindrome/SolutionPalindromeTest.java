package de.leetcode.planindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionPalindromeTest {


    SolutionPalindrome solutionPalindrome = new SolutionPalindrome();


    @Test
    public void isNoPalindromeTest() {
        assertFalse(solutionPalindrome.isPalindrome(123));
    }

    @Test
    public void isPalindromeTest() {
        assertTrue(solutionPalindrome.isPalindrome(121));
    }


}