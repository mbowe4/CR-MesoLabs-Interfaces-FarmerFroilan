package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.Tomato;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlantTest {

    @Test
    public void yieldWhileFertilizedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.yield();

        List<Tomato> expected = new ArrayList<>();
        expected.add(new Tomato());

        List<Tomato> actual = tomatoPlant.getTomatoes();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yieldWhileUnfertilizedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(false);
        tomatoPlant.yield();

        List<Tomato> expected = new ArrayList<>();
        List<Tomato> actual = tomatoPlant.getTomatoes();

        Assert.assertEquals(expected, actual);
    }
}
