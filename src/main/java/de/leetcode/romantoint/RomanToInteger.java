package  de.leetcode.romantoint;

import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.Data;

public class RomanToInteger {

   private static Map<Character, Integer> map = new HashMap<>();

    static {

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

    }

    private DataProvider provider;

    public RomanToInteger(DataProvider provider) {
        this.provider = provider;
    }

    public int romanToInt(String s) {

        int value = 0;
        int strLen = s.length();

        for (int i = 0; i < strLen; i++) {

            char c = s.charAt(i);
            int sign = 1;

            char next  = ' ';

            if (i + 1 < strLen) {
                next = s.charAt(i + 1);
            }

            if (c == 'I' && (next == 'V' || next == 'X')) {
                    sign = -1;
            } else if (c == 'X' &&  (next == 'L' || next == 'C')) {
                    sign = -1;
            } else if (c == 'C' && (next == 'D' || next == 'M')) {
                    sign = -1;
            }

            value += (sign * map.getOrDefault(c, 0));
        }


        return value;

    }

}