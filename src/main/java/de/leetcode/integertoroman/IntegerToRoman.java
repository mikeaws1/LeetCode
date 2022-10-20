package de.leetcode.integertoroman;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    
   private static Map<Integer, Character> map = new HashMap<>();
    static {

        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10,'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000,'M');

    }


    public String intToRoman(int num) {

        final StringBuilder builder = new StringBuilder();

        while(true) {
            for (int i: map.keySet()) {

                if (num / i == 0) {

                }

                if (num == 0)
                    break;

            }
            
            break;
        }

        return builder.toString();
    }
}
