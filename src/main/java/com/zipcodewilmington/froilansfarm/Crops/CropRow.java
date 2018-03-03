package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private final List<Crop> cropRow;

    public CropRow() {
        this.cropRow = new ArrayList<>();
    }

    public void add(Crop cropToAdd) {
        cropRow.add(cropToAdd);
    }

    public String showCropRow() {
        StringBuilder builder = new StringBuilder();
        for(Crop crop: cropRow) {
            builder.append(crop + "\n");
        }
        return builder.toString();
    }

    public List<Crop> getCropRow() {
        return cropRow;
    }
}


