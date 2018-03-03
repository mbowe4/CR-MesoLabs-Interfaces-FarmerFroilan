package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Producer;

public class CropDuster extends AirCraft implements FarmVehicle {

    public void fertilize(CropRow cropRowToFertilize) {
        for(Crop crop: cropRowToFertilize.getCropRow()) {
            crop.setHasBeenFertilized(true);
        }

    }
}
