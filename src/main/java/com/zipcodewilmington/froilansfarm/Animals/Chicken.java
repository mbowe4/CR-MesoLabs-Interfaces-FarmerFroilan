package com.zipcodewilmington.froilansfarm.Animals;


import com.zipcodewilmington.froilansfarm.Interfaces.Producer;

public class Chicken extends Animal implements Producer {
    private boolean hasEaten;

    public Chicken() {

        this.hasEaten = false;
    }

    public String makeNoise() {

        return "Caw";
    }

    public Egg yield() {
        return new Egg();
    }

    public String eat(Object isEdible) {
        this.hasEaten = true;
        return (this.getClass().getSimpleName() + " ate a " + isEdible.getClass().getSimpleName() + ".");
    }
}
