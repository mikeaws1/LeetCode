package de.leetcode.integertoroman;

import de.leetcode.util.Pair;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {

    private final IntegerToRoman integerToRoman = new IntegerToRoman();

    static Stream<Pair> getValues() {
        return Stream.of(
                new Pair(3, "III"),
                new Pair(4, "IV"),
                new Pair(58, "LVIII"),
                new Pair(1984, "MCMLXXXIV"),
                new Pair(3825, "MMMDCCCXXV"),
                new Pair(8485, "MMMMMMMMCDLXXXV"));
    }

    @ParameterizedTest
    @MethodSource("getValues")
    public void testIntToRoman(Pair p) {
            final String s = integerToRoman.intToRoman(p.value());
            assertEquals(p.letter(), s);
    }
}
