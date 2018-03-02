package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {


    public Horse(){
        super();
    }

    public String makeNoise() {
        return "Neigh";
    }

    public void eat(Edible edible) {
        ediblesEaten.add(edible);
    }
}
