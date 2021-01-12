package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidareText {
    public static void main(String[] args) {
        char[] array = new char[5];
        System.out.println(array.length);

        System.out.println();

    }

    public static String position(char alphabet) {
        return (int)alphabet + "";
    }

    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", position('a'));
        assertEquals("Position of alphabet: 26", position('z'));
        assertEquals("Position of alphabet: 5", position('e'));
    }
}
