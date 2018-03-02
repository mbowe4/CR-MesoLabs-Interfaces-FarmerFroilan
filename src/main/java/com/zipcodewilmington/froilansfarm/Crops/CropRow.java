package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private List<Crop> cropRow;

    public CropRow() {
        this.cropRow = new ArrayList<>();
    }

    public void addCropToCropRow(Crop cropToAdd) {
        cropRow.add(cropToAdd);
    }

    public String getCropRow() {
        StringBuilder builder = new StringBuilder();
        for(Crop crop: cropRow) {
            builder.append(crop + "\n");
        }
        return builder.toString();
    }
}


