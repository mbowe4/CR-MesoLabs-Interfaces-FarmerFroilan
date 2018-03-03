package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.*;

public class Farmer extends Person implements Rider, Botanist, Eater {
    private Farm farm;


    public Farmer(String name) {
        super(name);
        this.farm = new Farm();
    }

    public void plant(Crop cropToAdd) {
        for(CropRow cropRow: farm.getField().getCropRowsList()) {
            if (farm.hasCrop(cropToAdd)) {
                cropRow.add(cropToAdd);
            }
            else {
                CropRow newCropRow = new CropRow();
                farm.getField().getCropRowsList().add(newCropRow);
                newCropRow.add(cropToAdd);
            }
        }
    }

    public String makeNoise() {
        return "Howdy, I'm a farmer!";
    }

    public String getFarm(){
        return this.farm.showFarm();
    }
}
