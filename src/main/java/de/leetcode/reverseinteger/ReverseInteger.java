package de.leetcode.reverseinteger;

import java.util.ArrayList;
import java.util.List;

import de.leetcode.util.Util;

public class ReverseInteger {


    public int reverse(int value) {

        int base = 10;
        int reverseValue = 0;
        final List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            final int rem = value % base;
            value = value / base;
            list.add(rem);

            if (value == 0) {
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int exp = list.size() - i - 1;
            reverseValue += (list.get(i) * Util.power(exp));
        }

        return reverseValue;

    }

}
