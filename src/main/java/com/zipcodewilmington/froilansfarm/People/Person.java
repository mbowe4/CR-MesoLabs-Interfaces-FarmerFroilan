package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Person implements Eater, NoiseMaker, Rider {
    private String name;
    private final List<Edible> ediblesEaten;
    private final List<Rideable> rideablesRidden;
    private boolean isRiding;

    public Person(String name) {
        this.setName(name);
        this.ediblesEaten = new ArrayList<>();
        this.rideablesRidden = new ArrayList<>();
        this.setRidingStatus(false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Edible edible) {
        this.ediblesEaten.add(edible);
    }

    public List<Edible> getEdiblesEaten() {
        return this.ediblesEaten;
    }

    public String makeNoise() {
        return "Howdy!";
    }

    public void mount(Rideable rideable) {
        if(this.getRidingStatus()) {
            this.ride(rideable);
        }
    }

    public void dismount() {
        this.setRidingStatus(false);
    }

    public void ride(Rideable rideable) {
        this.setRidingStatus(true);
        this.rideablesRidden.add(rideable);
    }

    private void setRidingStatus(Boolean status) {
        this.isRiding = status;
    }

    public Boolean getRidingStatus() {
        return isRiding;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getName();
    }


}
