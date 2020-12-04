package com.company.loops;

public class Loops {
    public static void main(String[] args) {

        String x = "Ana are mere si pere rosii si galbene";

        for (int i = 0; i < x.length(); i = i + 2) {
            System.out.print(x.charAt(i));
        }
    }
}
