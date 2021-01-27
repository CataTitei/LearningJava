package com.company.oop.polymorfism.model;

public class Pisica extends Animal{
    public Pisica(String nume) {
        super(nume);
    }


    public void doSound(){
        System.out.println(getNume() + " made miau!");
    }

    @Override
    public void whatAmI() {
        System.out.println("Eu sunt: " + Pisica.class.getSimpleName());
    }
}
