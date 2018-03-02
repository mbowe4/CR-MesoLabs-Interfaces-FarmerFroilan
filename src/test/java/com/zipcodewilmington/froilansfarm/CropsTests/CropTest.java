package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.GrapeVine;
import com.zipcodewilmington.froilansfarm.Crops.KalePlant;
import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void getHasBeenFertilizedTest() {
        GrapeVine grapeVine = new GrapeVine();

        boolean expected = false;
        boolean actual = grapeVine.getHasBeenFertilized();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHasBeenHarvestedTest() {
        KalePlant kalePlant = new KalePlant();

        boolean expected = false;
        boolean actual = kalePlant.getHasBeenHarvested();

        Assert.assertEquals(expected, actual);
    }
}
