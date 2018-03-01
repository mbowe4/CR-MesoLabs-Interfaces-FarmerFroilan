package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public class Person implements Eater, NoiseMaker {
    private String name;
    private boolean hasEaten;

    public Person(String name) {
        this.setName(name);
        this.setHasEaten(false);
    }
    public String eat(Object isEdible) {
        this.setHasEaten(true);
        return this.getName() + " ate a " + isEdible.getClass().getSimpleName() + ".";
    }

    public String makeNoise() {
        return "Howdy!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHasEaten(Boolean status) {
         this.hasEaten = status;
    }

    public Boolean getHasEaten() {
        return hasEaten;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getName();
    }
}
