package com.company;

// Cauta litera x dintr-un text

import java.util.Scanner;

public class LiteraXText {
    public static void main(String[] args) {

        System.out.print("Introduceti un text: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print("Introduce litera pe care vrei sa o gasesti: ");

        //  char x = 'a';
        char x = sc.nextLine().charAt(0);

        //String str = "I am learning Java";
        for (int i = 0; i < st.length(); i++) {
            char caracterulCurent = st.charAt(i);
            if (caracterulCurent == x) {
                System.out.println("Caracterul " + "\""+x+"\"" + " a fost gasit la indexul: " + i);
            }

        }
    }
}
