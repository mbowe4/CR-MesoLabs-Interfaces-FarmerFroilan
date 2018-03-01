package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;

public interface Botanist {

    void plant(Crop crop);

    void addCropToCropRow(Crop crop);
}
