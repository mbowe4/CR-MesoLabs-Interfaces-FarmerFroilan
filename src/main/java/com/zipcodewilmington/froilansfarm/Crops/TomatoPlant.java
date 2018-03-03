package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop {
    private List<Tomato> tomatoes = new ArrayList<Tomato>();


    public void yield() {
        if(this.getHasBeenFertilized()) {
            tomatoes.add(new Tomato());
        }
    }

    public List<Tomato> getTomatoes() {
        return tomatoes;
    }

    @Override
    public boolean hasBeenHarvested() {
        return this.tomatoes.isEmpty();
    }
}
