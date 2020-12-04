package com.company;

public class Program {
    public static void main(String[] args) {
        String x = "Caietul cu linii";
        int index = 5;
        Caine caine = new Caine();

        char y = caine.getCharFromIndex(x, index);
        System.out.println(y);
    }
}

class Caine {
    public char getCharFromIndex(String text, int k) {
        return text.charAt(k);
    }
}