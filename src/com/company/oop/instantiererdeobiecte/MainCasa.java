package com.company.oop.instantiererdeobiecte;

public class MainCasa {
    public static void main(String[] args) {
        /*Casa casaSimpleFaraNimic = new Casa();
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
        System.out.println(casaCompleta.getNumeCasa());*/

       /* Casa casa3 = new Casa();
        casa3.setNumeCasa("nume casa");
        System.out.println(casa3.getNumeCasa());*/

        /*String numeCasaStatica = Casa.getNumeCasa2(); // nu ai nevoie de instanta
        System.out.println("Asta inseamna static " + numeCasaStatica);*/


        Casa casa10 = new Casa();
        casa10.numeCasa2 = "Nume nou la casa statica";
        System.out.println(casa10.numeCasa2); // 1
        System.out.println(Casa.numeCasa2); // 2

        Casa casa11 = new Casa();
        System.out.println(casa11.numeCasa2); // 3
        casa11.numeCasa2 = "Alt nume nou la casa statica";
        System.out.println(casa10.numeCasa2); // 4
        System.out.println(casa11.numeCasa2); // 5
        System.out.println(Casa.numeCasa2); // 6
    }
}
