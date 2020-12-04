package com.company.loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        System.out.println("This program will run until the safe word is written! Enter the break word");
        Scanner sc = new Scanner(System.in);
        String cititDeLaTaste = "";
        String safeWord = sc.nextLine();

        while (!cititDeLaTaste.equals(safeWord)) {
            System.out.println("Enter Safe Word ");
            cititDeLaTaste = sc.nextLine();
            if (cititDeLaTaste.equals(safeWord)) {
                System.out.println("That is the right answer");
            }
        }

        // Warkaround to use for instead of while

        int i = 0;
        for (i = 0; i < 2; i++) {
            i--;
            System.out.println("Enter Safe Word ");
            cititDeLaTaste = sc.nextLine();
            if (cititDeLaTaste.equals(safeWord)) {
                System.out.println("That is the right answer");
                i = 2;
                // break
            }
        }

    }
}
