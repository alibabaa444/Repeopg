package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Parrot());

        for (Animal animal : animals) {
            animal.makeSound();
        }

        ArrayList<Animal> mammals = filterMammals(animals);
        ArrayList<Animal> lions = filterLions(animals);
    }

    static ArrayList<Animal> filterMammals(ArrayList<Animal> animals) {
        ArrayList<Animal> mammals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.isMammal) {
                mammals.add(animal);
            }
        }
        return mammals;
    }

    static ArrayList<Animal> filterLions(ArrayList<Animal> animals) {
        ArrayList<Animal> lions = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Lion) {
                lions.add(animal);
            }
        }
        return lions;
    }
}