package com.company.colectii;

import java.util.ArrayList;

public class ArrayExample {
    public static void main(String[] args) {

        // int[] array = new int[]{};
        // int[] arr = {};
        int[] arr2 = {1, 2, 3};
        float[] arr3 = {1.1f, 2, 3.4f};
        long[] arr4 = {1L, 2L, 3L};
        double[] arr5 = {1.8, 2, 3d};

        //print un array
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }

        //print o lista
        System.out.println("###");
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(7);
        lista.add(9);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // enhanced for loop
        for (Integer elementCurent : lista) {
            System.out.println(elementCurent);

        }


    }
}
