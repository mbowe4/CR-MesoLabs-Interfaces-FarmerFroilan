package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<CropRow> cropRows;

    public Field() {
        cropRows = new ArrayList<>();
    }

    public String showField() {
        StringBuilder crops = new StringBuilder();
        for(CropRow cropRow: cropRows) {
            crops.append(cropRow.showCropRow());
        }
        return crops.toString();
    }

    public List<CropRow> getCropRowsList() {
        return this.cropRows;
    }

    public void add(CropRow cropRow) {
        cropRows.add(cropRow);
    }
}
