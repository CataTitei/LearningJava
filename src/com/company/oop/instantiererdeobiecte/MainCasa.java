package com.company.oop.instantiererdeobiecte;

public class MainCasa {
    public static void main(String[] args) {
        Casa casaSimpleFaraNimic = new Casa();
        System.out.println(casaSimpleFaraNimic.hasGaraj());
        System.out.println(casaSimpleFaraNimic.getNrGeamuri());
        System.out.println(casaSimpleFaraNimic.getNumeCasa());

        Casa casaCuCevaNuToate = new Casa(4, 5, 7, 8);
        System.out.println(casaCuCevaNuToate.hasGaraj());
        casaCuCevaNuToate.setHasGaraj(true);
        System.out.println(casaCuCevaNuToate.hasGaraj());

        Casa casaCompleta = new Casa(5, 4, 3, 2, true);
        System.out.println(casaCompleta.setHasGaraj(true));
        casaCompleta.setNumeCasa("Casa frumoasa");

        // primitivele au valoare default : int = 0; boolean = false
        // obiectele in schimb are valoare default null (variabile de instanta)
        System.out.println(casaCompleta.getNumeCasa());

    }
}
