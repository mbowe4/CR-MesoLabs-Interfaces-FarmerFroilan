package com.zipcodewilmington.froilansfarm.FarmTests;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.GrapeVine;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void getCropRowsTest() {
        Field field = new Field();
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();

        cropRow1.add(new TomatoPlant());
        cropRow1.add(new TomatoPlant());
        cropRow2.add(new GrapeVine());
        cropRow2.add(new GrapeVine());

        field.add(cropRow1);
        field.add(cropRow2);

        String expected =   "TomatoPlant\n" +
                            "TomatoPlant\n" +
                            "GrapeVine\n" +
                            "GrapeVine\n";
        String actual = field.showField();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addCropRowTest() {
        Field field = new Field();
        field.add(new CropRow());

        int expected = 1;
        int actual = field.getCropRowsList().size();
        
        Assert.assertEquals(expected, actual);
    }
}
