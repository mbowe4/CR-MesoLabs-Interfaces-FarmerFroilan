package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<CropRow> cropRows;

    public Field() {
        cropRows = new ArrayList<CropRow>();
    }

    public String getCropRows() {
        StringBuilder crops = new StringBuilder();
        for(CropRow cropRow: cropRows) {
            crops.append(cropRow);
        }
        return crops.toString();
    }

    public void addCropRow(CropRow cropRow) {
        cropRows.add(cropRow);
    }
}
