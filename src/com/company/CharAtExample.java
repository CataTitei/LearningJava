package com.company;

//Sa se afiseze primul si al 4-lea caracter din sirul de caractere

public class CharAtExample {
    public static void main(String[] args) {
        String s = "I am learning Java";

        char chr1 = s.charAt(0);
        char chr4 = s.charAt(5);

        System.out.println("Primul caracter este:"+chr1);
        System.out.println("Al 4-lea caracter este:"+chr4);

    }
}
