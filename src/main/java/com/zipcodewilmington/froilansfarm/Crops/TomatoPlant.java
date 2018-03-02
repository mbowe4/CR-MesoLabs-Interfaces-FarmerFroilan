package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop {
    private List<Tomato> tomatoes = new ArrayList<Tomato>();


    public void yield() {
        tomatoes.add(new Tomato());
    }

    public List<Tomato> getTomatoes() {
        return tomatoes;
    }
}
