package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.Tomato;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlantTest {

    @Test
    public void yieldTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.yield();

        List<Tomato> expected = new ArrayList<>();
        expected.add(new Tomato());

        List<Tomato> actual = tomatoPlant.getTomatoes();

        Assert.assertEquals(expected, actual);
    }
}
