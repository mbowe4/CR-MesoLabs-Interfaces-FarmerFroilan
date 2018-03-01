package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    private boolean hasEaten;

    public Horse(){
        this.setHasEaten(false);
    }

    public String makeNoise() {
        return "Neigh";
    }

    public String eat(Object isEdible) {
        this.setHasEaten(true);
        return this.getClass().getSimpleName() + " ate a " + isEdible.getClass().getSimpleName() + ".";
    }

    private void setHasEaten(Boolean status) {
        this.hasEaten = status;
    }

    public Boolean getHasEaten() {
        return hasEaten;
    }
}
