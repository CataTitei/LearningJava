package com.company.oop.polymorfism.model;

public class Pasare extends Animal{
    public Pasare(String nume) {
        super(nume);
    }

    @Override
    public void doSound(){
        System.out.println(getNume() + " made cirip!");
    }

    @Override
    public void whatAmI(){
        System.out.println("Eu sunt: " + Pasare.class.getSimpleName());
    }
}
