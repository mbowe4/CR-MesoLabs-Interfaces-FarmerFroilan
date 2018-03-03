package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private final List<Stable> stables;
    private final List<ChickenCoop> chickenCoops;
    private final FarmHouse farmHouse;
    private final Field field;

    public Farm() {
        this.stables = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
        this.farmHouse = new FarmHouse();
        this.field = new Field();
    }


    public String showStables() {
        StringBuilder builder = new StringBuilder();
        for(Stable stable: stables) {
            builder.append(stable.showStable() + "\n");
        }
        return builder.toString();
    }

    public List<Stable> getStables() {
        return stables;
    }

    public String showChickenCoops() {
        StringBuilder builder = new StringBuilder();
        for(ChickenCoop chickenCoop: chickenCoops) {
            builder.append(chickenCoop.showChickenCoop() + "\n");
        }
        return builder.toString();
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public String showFarmHouse() {
        return farmHouse.showPeople();
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public String getFieldString() {
        return field.showField();
    }

    public Field getField() {
        return field;
    }

    public boolean hasCrop(Crop crop) {
        return this.getField().getCropRowsList().contains(crop);
    }

    public String showFarm() {
        StringBuilder builder = new StringBuilder();
        builder.append("Chicken Coops: \n" + this.showChickenCoops())
                .append("\nFarm House: \n" + this.showFarmHouse())
                .append("\nField: \n" + this.getFieldString())
                .append("\nStables: \n" + this.showStables());
        return builder.toString();
    }

}
