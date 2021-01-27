package com.company.oop.polymorfism.model;

public abstract class Animal { // use case -- nu vrem instante Animmal
    private String nume;
    private int varsta;

    // Overload
    public Animal(String nume) {
        this.nume = nume;
    }

    // Overload
    public Animal(String nume, int varsta) {
        this(nume);
        this.varsta = varsta;
    }

    // Overload
    public Animal(){

    }

    public static Animal getInstance(){
        return new Animal() {

        };
    }


    public void doSound(){
        System.out.println(getNume() + " did a generic sound!");
    }

    public void whatAmI(){
        System.out.println("Eu sunt: " + Animal.class.getSimpleName());
    }

    public String getNume() {
        return nume;
    }

    public Animal setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public int getVarsta() {
        return varsta;
    }

    public Animal setVarsta(int varsta) {
        this.varsta = varsta;
        return this;
    }
}
