package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    private final List<Chicken> chickens;

    public ChickenCoop() {
        this.chickens = new ArrayList<>();
    }

    public void addChickenToChickenCoop() {
        this.chickens.add(new Chicken());
    }

    public String showChickenCoop() {
        StringBuilder builder = new StringBuilder();
        for(Chicken chicken: chickens) {
            builder.append(chicken + "\n");
        }
        return builder.toString();
    }

    public List<Chicken> getChickens() {
        return chickens;
    }
}
