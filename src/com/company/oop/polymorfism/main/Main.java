package com.company.oop.polymorfism.main;

import com.company.oop.abstractization.MyInterface;
import com.company.oop.polymorfism.model.Animal;
import com.company.oop.polymorfism.model.Caine;
import com.company.oop.polymorfism.model.Pasare;
import com.company.oop.polymorfism.model.Pisica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal("Dino"); --- am facut-o abstracta

        Animal animal2 = Animal.getInstance(); // putem lua instanta totusi

        animal2.whatAmI();
        animal2.doSound();
        Animal dog1 = new Caine("Rex");
        Animal pisica1 = new Pisica("Garfield");
        Animal pasare1 = new Pasare("Woody");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal2);
        animals.add(dog1);
        animals.add(pasare1);
        animals.add(pisica1);

        for(Animal animal: animals){
           // animal.doSound();
            animal.whatAmI();
        }


        MyInterface myInterface = new MyInterface() {
            @Override
            public void doSmth() {
                System.out.println("something");
            }

            @Override
            public void doSmth(String name) {

            }

            @Override
            public String doSmth(String name, int i) {
                return null;
            }
        };

        myInterface.doSmth();;

    }
}
