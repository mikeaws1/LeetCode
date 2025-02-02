package de.leetcode.atoi;

import java.util.Map;
import java.util.Stack;

public class SolutionAtoi {

    Map<Character, Long> map = Map.of(
            '0', 0L,
            '1', 1L,
            '2', 2L,
            '3', 3L,
            '4', 4L,
            '5', 5L,
            '6', 6L,
            '7', 7L,
            '8', 8L,
            '9', 9L);

    public int myAtoi(String str) {
        long solution = 0;
        int power = 0;
        char[] chars = str.toCharArray();
        long sign = 0;
        Stack<Character> stack = new Stack<>();
        int i;

        for (i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                break;
            }
        }

        for (; i < chars.length; i++) {

            if (chars[i] == '-') {
                if (sign != 0) {
                    return 0;
                }
                sign = -1;
            } else if (chars[i] == '+') {
                if (sign != 0) {
                    return 0;
                }
                sign = 1;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                stack.push(chars[i]);
                if (i < chars.length - 1 && (chars[i + 1] == '-' || chars[i + 1] == '+')) {
                    break;
                }
            } else {
                break;
            }
        }
        if (sign ==  0) {
            sign = 1;
        }

        while (!stack.isEmpty()) {
            char c = stack.pop();
            long pp = power(power);
            if (pp == 0) {
                return Integer.MAX_VALUE;
            }

            solution += (pp * map.get(c));

            if (solution > Integer.MAX_VALUE) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            else if (solution < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            power++;
        }



        return (int) (sign* solution);
    }

    private long power(long exp) {

        long power = 1;

        for (int i = 0; i < exp; i++) {
            power = power * 10;
        }

        return power;
    }
}
