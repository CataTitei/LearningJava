package com.company.oop.polymorfism.main;

import com.company.oop.polymorfism.model.Animal;
import com.company.oop.polymorfism.model.Caine;
import com.company.oop.polymorfism.model.Pasare;
import com.company.oop.polymorfism.model.Pisica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Dino");
        Animal dog1 = new Caine("Rex");
        Animal pisica1 = new Pisica("Garfield");
        Animal pasare1 = new Pasare("Woody");

        List<Animal> animals = new ArrayList<>();
        animals.add(a);
        animals.add(dog1);
        animals.add(pasare1);
        animals.add(pisica1);

        for(Animal animal: animals){
           // animal.doSound();
            animal.whatAmI();
        }

    }
}
