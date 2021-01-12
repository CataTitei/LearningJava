package com.company.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class findPosition {
    public static String position(char alphabet) {
        return "Position of alphabet: " + ((int) alphabet - 96);
    }

    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", position('a'));
        assertEquals("Position of alphabet: 26", position('z'));
        assertEquals("Position of alphabet: 5", position('e'));
    }

    @Test
    public void basicTests2() {
        assertEquals("Position of alphabet: 2", position('b'));

    }
}
