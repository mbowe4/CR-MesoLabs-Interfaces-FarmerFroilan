package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

import java.util.ArrayList;
import java.util.List;

public class Person implements Eater, NoiseMaker, Rider {
    private String name;
    private List<Edible> ediblesEaten;

    public Person(String name) {
        this.setName(name);
        ediblesEaten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Edible edible) {
        ediblesEaten.add(edible);
    }

    public List<Edible> getEdiblesEaten() {
        return ediblesEaten;
    }

    public boolean hasEaten() {
        return !ediblesEaten.isEmpty();
    }

    public String makeNoise() {
        return "Howdy!";
    }

    public String mount(Object rideable) {
        return null;
    }

    public void dismount() {

    }

    public String ride(Object rideable) {
        return null;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getName();
    }


}
