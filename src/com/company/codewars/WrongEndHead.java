package com.company.codewars;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * You're at the zoo... all the meerkats look weird.
 * Something has gone terribly wrong - someone has gone and switched their heads and tails around! *
 * Save the animals by switching them back.
 * You will be given an array which will have three values (tail, body, head).
 * It is your job to re-arrange the array so that the animal is the right way round (head, body, tail). *
 * Same goes for all the other arrays/lists that you will get in the tests:
 * you have to change the element positions with the same exact logics
 */

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        /*String[] newArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - i - 1];
        }*/

        String a = arr[0];
        String b = arr[1];
        String c = arr[2];
        String aux = a;

        a = c;
        c = aux;
        String[] newArray = new String[arr.length];
        newArray[0] = a;
        newArray[1] = b;
        newArray[2] = c;

        return newArray;
    }

    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{"head", "body", "tail"},
                WrongEndHead.fixTheMeerkat(new String[]{"tail", "body", "head"}));
    }

    @Test
    public void exampleTest2() {
        String[] arrayStocat = fixTheMeerkat(new String[]{"tails", "body", "heads"});
        assertArrayEquals(new String[]{"heads", "body", "tails"}, arrayStocat);
    }


    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{"top", "middle", "bottom"},
                WrongEndHead.fixTheMeerkat(new String[]{"bottom", "middle", "top"}));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{"upper legs", "torso", "lower legs"},
                WrongEndHead.fixTheMeerkat(new String[]{"lower legs", "torso", "upper legs"}));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{"sky", "rainbow", "ground"},
                WrongEndHead.fixTheMeerkat(new String[]{"ground", "rainbow", "sky"}));
    }
}
