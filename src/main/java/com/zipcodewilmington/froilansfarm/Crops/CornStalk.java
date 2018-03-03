package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;


public class CornStalk extends Crop {
    private List<EarCorn> earCorns = new ArrayList<>();


    public void yield() {
        if(this.getHasBeenFertilized()) {
            earCorns.add(new EarCorn());
        }
    }

    public List<EarCorn> getEarCorns() {
        return earCorns;
    }

    @Override
    public boolean hasBeenHarvested() {
        return this.earCorns.isEmpty();
    }
}
