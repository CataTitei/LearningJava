package com.company.program;

public class Main {
    public static void main(String[] args) {
        String a = "Ana are mere.";
        String b = "Grigore merge la scoala.";

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(a.length() - (a.length() - b.length()));

        System.out.println("a = " + a);
        System.out.println("b = " + b );
    }
}
