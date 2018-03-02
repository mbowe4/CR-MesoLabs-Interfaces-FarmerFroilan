package com.zipcodewilmington.froilansfarm.Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Field field;

    public Farm() {
        this.stables = new ArrayList<Stable>();
        this.chickenCoops = new ArrayList<ChickenCoop>();
        this.farmHouse = new FarmHouse();
        this.field = new Field();
    }


    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public String getField() {
        return field.getCropRows();
    }

}
