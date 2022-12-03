package de.leetcode.integertoroman;

import de.leetcode.util.Pair;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class IntegerToRoman {

    private final static List<Pair> MAP = new ArrayList<>();

    static {
        MAP.add(new Pair(1000, "M"));
        MAP.add(new Pair(900, "CM"));
        MAP.add(new Pair(500, "D"));
        MAP.add(new Pair(400, "CD"));
        MAP.add(new Pair(100, "C"));
        MAP.add(new Pair(90, "XC"));
        MAP.add(new Pair(50, "L"));
        MAP.add(new Pair(40, "XL"));
        MAP.add(new Pair(10, "X"));
        MAP.add(new Pair(5, "V"));
        MAP.add(new Pair(4, "IV"));
        MAP.add(new Pair(1, "I"));


    }


    public String intToRoman(int num) {

        final StringBuilder builder = new StringBuilder();

        for (int j = 0; j < MAP.size(); j++)  {

            final Pair pair = MAP.get(j);

            final int i = pair.value();
            final String romanNumber = pair.letter();

            if (num / i > 0) {

                final int rep = num / i;

                if (rep > 3) {
                    final Pair previousPair = MAP.get(j - 1);
                    builder.append(romanNumber);
                    builder.append(previousPair.letter());
                }
                else {
                    builder.append(StringUtils.repeat(romanNumber, rep));
                }
                num -= (rep * i);
            }
        }

        return builder.toString();
    }
}
