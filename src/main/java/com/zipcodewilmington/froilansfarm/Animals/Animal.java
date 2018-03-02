package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater {
    protected List<Edible> ediblesEaten;

    public Animal() {
        ediblesEaten = new ArrayList<>();
    }

    public List<Edible> getEdiblesEaten() {
        return ediblesEaten;
    }

    public boolean hasEaten() {
        return !ediblesEaten.isEmpty();
    }
}
