package de.leetcode.planindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionPalindromeTest {


    SolutionPalindrome solutionPalindrome = new SolutionPalindrome();


    @Test
    public void isNoPalindromeTest() {
        assertFalse(solutionPalindrome.isPalindrome2(123));
    }

    @Test
    public void isPalindromeTest() {
        assertTrue(solutionPalindrome.isPalindrome2(121));
    }

    @Test
    public void isPalindromeTest2() {
        assertTrue(solutionPalindrome.isPalindrome2(1001));
    }

    @Test
    public void isPalindromeTest3() {
        assertFalse(solutionPalindrome.isPalindrome2(10));
    }

    @Test
    public void isPalindromeTest4() {
        assertTrue(solutionPalindrome.isPalindrome2(1));
    }

}