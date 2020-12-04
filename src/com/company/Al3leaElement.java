package com.company;

import java.util.Scanner;

public class Al3leaElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        // String str = "StringOfCharacters";
        for (int i = 0; i < st.length(); i = i + 3)
            System.out.println(st.charAt(i));
    }
}
