package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;

import com.zipcodewilmington.froilansfarm.Crops.KalePlant;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {

    @Test
    public void constructorTest() {
        CropRow cropRow1 = new CropRow();
        KalePlant kalePlant1 = new KalePlant();
        KalePlant kalePlant2 = new KalePlant();

        cropRow1.add(kalePlant1);
        cropRow1.add(kalePlant2);

        String expected = "KalePlant\nKalePlant\n";
        String actual = cropRow1.showCropRow();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addCropToCropRowTest() {
        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.add(tomatoPlant);

        int expected = 1;
        int actual = cropRow.getCropRow().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void showCropRowTest() {
        CropRow cropRow = new CropRow();
        cropRow.add(new TomatoPlant());

        String expected = "TomatoPlant\n";
        String actual = cropRow.showCropRow();

        Assert.assertEquals(expected, actual);
    }
}
