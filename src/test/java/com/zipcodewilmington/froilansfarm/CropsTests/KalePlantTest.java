package com.zipcodewilmington.froilansfarm.CropsTests;


import com.zipcodewilmington.froilansfarm.Crops.Kale;
import com.zipcodewilmington.froilansfarm.Crops.KalePlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KalePlantTest {

    @Test
    public void yieldWhileFertilizedTest() {
        KalePlant kalePlant = new KalePlant();
        kalePlant.setHasBeenFertilized(true);
        kalePlant.yield();

        List<Kale> expected = new ArrayList<>();
        expected.add(new Kale());

        List<Kale> actual = kalePlant.getKales();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yieldWhileUnfertilizedTest() {
        KalePlant kalePlant = new KalePlant();
        kalePlant.setHasBeenFertilized(false);
        kalePlant.yield();

        List<Kale> expected = new ArrayList<>();
        List<Kale> actual = kalePlant.getKales();

        Assert.assertEquals(expected, actual);
    }
}
