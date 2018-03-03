package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

public class KalePlant extends Crop {
    private List<Kale> kales = new ArrayList<Kale>();


    public void yield() {
        if(getHasBeenFertilized()) {
            kales.add(new Kale());
        }
    }

    public List<Kale> getKales() {
        return kales;
    }

    @Override
    public boolean hasBeenHarvested() {
        return this.kales.isEmpty();
    }
}
