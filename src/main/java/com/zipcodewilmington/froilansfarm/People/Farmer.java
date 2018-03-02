package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist, Eater {
    private Farm farm;
    private boolean isRiding;


    public Farmer(String name) {
        super(name);
        this.farm = new Farm();
        this.isRiding = false;
    }

    public String mount(Object rideable) {
        return this.ride(rideable);
    }

    public void dismount() {
        this.setRidingStatus(false);
    }

    public String eat(Object edible) {

        return (this.getName() + " ate a " + edible.getClass().getSimpleName() + ".");
    }

    public void plant(Crop crop) {
        this.addCropToCropRow(crop);
    }

    public void addCropToCropRow(Crop crop) {

    }

    public String makeNoise() {
        return "Howdy, I'm a farmer!";
    }

    public String ride(Object rideable) {
        this.setRidingStatus(true);
        return this.getName() + " is riding " + rideable.getClass().getSimpleName() + ".";
    }

    private void setRidingStatus(Boolean status) {
        this.isRiding = status;
    }

    public Boolean getRidingStatus() {
        return isRiding;
    }


}
