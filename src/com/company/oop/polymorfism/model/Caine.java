package com.company.oop.polymorfism.model;

public class Caine extends Animal{
    public Caine(String nume) {
        super(nume);
    }

    // overload
    public void doSound(){
        System.out.println(getNume() + " made woof!");
    }

    // overload
    public void doSound(int i){
       // doSound(5); -- recursivitate infinita
        doSound();
    }

    public void whatAmI(){
        System.out.println("Eu sunt: " + Caine.class.getSimpleName());
    }



}
