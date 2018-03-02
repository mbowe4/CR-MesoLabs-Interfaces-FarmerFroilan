package com.zipcodewilmington.froilansfarm.Animals;


import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Producer;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Animal implements Producer {
    private List<Egg> eggs = new ArrayList<>();

    public Chicken() {
        super();
    }

    public String makeNoise() {
        return "Caw";
    }

    public void yield() {
        eggs.add(new Egg());
    }

    public List<Egg> getEggs() {
        return eggs;
    }

    public void eat(Edible edible) {
        ediblesEaten.add(edible);
    }
}
