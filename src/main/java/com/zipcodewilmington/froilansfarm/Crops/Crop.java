package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Producer;

public abstract class  Crop implements Producer {
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop() {
        this.setHasBeenHarvested(false);
        this.setHasBeenFertilized(false);
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean status) {
        this.hasBeenFertilized = status;
    }

    public boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public abstract boolean hasBeenHarvested();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
