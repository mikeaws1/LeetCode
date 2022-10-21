package de.leetcode.romantoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> MAP = new HashMap<>();

    static {

        MAP.put('I', 1);
        MAP.put('V', 5);
        MAP.put('X', 10);
        MAP.put('L', 50);
        MAP.put('C', 100);
        MAP.put('D', 500);
        MAP.put('M', 1000);

    }

    private final DataProvider provider;

    public RomanToInteger(DataProvider provider) {
        this.provider = provider;
    }


    public int romanToInt(String s) {
        int value = 0;
        final int strLen = s.length();

        for (int i = 0; i < strLen; i++) {

            char c = s.charAt(i);
            int sign = 1;

            char next = ' ';

            if (i + 1 < strLen) {
                next = s.charAt(i + 1);
            }

            if (c == 'I' && (next == 'V' || next == 'X')) {
                sign = -1;
            } else if (c == 'X' && (next == 'L' || next == 'C')) {
                sign = -1;
            } else if (c == 'C' && (next == 'D' || next == 'M')) {
                sign = -1;
            }

            value += (sign * MAP.getOrDefault(c, 0));
        }

        return value;

    }
    public List<Integer> romanToInt() {

        if (provider == null) {
            return new ArrayList<>();
        }

        final List<String> romanIntsList = provider.getDataBatch();
        final List<Integer> result = new ArrayList<>();

        for (String s: romanIntsList) {
            int value = romanToInt(s);
            result.add(value);
         }

        return result;

    }

}