package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {
    private final List<Horse> horseStable;


    public Stable() {
        this.horseStable = new ArrayList<>();
    }

    public void addHorseToStable() {
        horseStable.add(new Horse());
    }

    public String showStable() {
        StringBuilder builder = new StringBuilder();
        for(Horse horse: horseStable) {
            builder.append(horse + "\n");
        }
        return builder.toString();
    }

    public List<Horse> getHorseStable() {
        return horseStable;
    }



}
