package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

public class GrapeVine extends Crop {
    private List<Grape> grapes = new ArrayList<Grape>();

    public void yield() {
        if(this.getHasBeenFertilized()) {
            grapes.add(new Grape());
        }
    }

    public List<Grape> getGrapes() {
        return grapes;
    }

    @Override
    public boolean hasBeenHarvested() {
        return this.grapes.isEmpty();
    }
}
