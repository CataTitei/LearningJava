package com.company.loops;

public class Loops2 {
    public static void main(String[] args) {

        String x = "Caietul este cu linii";

        for (int i = 0; i < x.length(); i++) {

            if (i % 2 == 0) {

                System.out.print(x.charAt(i));
            }
        }


    }
}
