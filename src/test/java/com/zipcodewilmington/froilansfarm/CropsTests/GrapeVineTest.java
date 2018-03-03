package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.GrapeVine;
import com.zipcodewilmington.froilansfarm.Crops.Grape;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GrapeVineTest {

    @Test
    public void yieldWhileFertilizedTest() {
        GrapeVine grapeVine = new GrapeVine();
        grapeVine.setHasBeenFertilized(true);
        grapeVine.yield();

        List<Grape> expected = new ArrayList<>();
        expected.add(new Grape());

        List<Grape> actual = grapeVine.getGrapes();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yieldWhileUnfertilizedTest() {
        GrapeVine grapeVine = new GrapeVine();
        grapeVine.setHasBeenFertilized(false);
        grapeVine.yield();

        List<Grape> expected = new ArrayList<>();
        List<Grape> actual = grapeVine.getGrapes();

        Assert.assertEquals(expected, actual);
    }
}
