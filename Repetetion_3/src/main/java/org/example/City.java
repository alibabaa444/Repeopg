package org.example;

public class City {

    String name;
    int population;

    City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }
    public int getPopulation(){
        return population;
    }
}
