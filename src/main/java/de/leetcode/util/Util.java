package de.leetcode.util;

public class Util {
    
    public static int power(int exp) {

       int power = 1;

       for (int i = 0; i < exp; i++) {
            power = power * 10;
       }

       return power;
    }
}
