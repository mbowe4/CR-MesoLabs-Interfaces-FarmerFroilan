package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

public class StrawberryBush extends Crop {
    private List<Strawberry> strawberries = new ArrayList<Strawberry>();

    public void yield() {
        if(this.getHasBeenFertilized()) {
            strawberries.add(new Strawberry());
        }
    }

    public List<Strawberry> getStrawberries() {
        return strawberries;
    }

    @Override
    public boolean hasBeenHarvested() {
        return this.strawberries.isEmpty();
    }
}
