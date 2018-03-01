package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person implements Rider{
    private boolean isRiding;

    public Pilot(String name) {
        super(name);
    }

    public String mount(Object rideable) {
        return this.ride(rideable);
    }

    public void dismount() {
        this.setRidingStatus(false);
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
