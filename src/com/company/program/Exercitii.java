package com.company.program;

public class Exercitii {
    public static void main(String[] args) {
        System.out.println(sum('1', '2'));
    }

    // Overloading
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static int sum() {
        return -1;
    }

    public static int sum(int a) {
        return a + 10;
    }

    public static int sum(String a) {
        return Integer.parseInt(a) + 10;
    }

    public static int sum(char a, char b){
        return a - '0' + b - '0';
    }
}
