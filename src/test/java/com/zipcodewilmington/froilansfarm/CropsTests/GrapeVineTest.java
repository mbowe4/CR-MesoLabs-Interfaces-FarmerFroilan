package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.GrapeVine;
import com.zipcodewilmington.froilansfarm.Crops.Grape;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GrapeVineTest {

    @Test
    public void yieldTest() {
        GrapeVine grapeVine = new GrapeVine();
        grapeVine.yield();

        List<Grape> expected = new ArrayList<>();
        expected.add(new Grape());

        List<Grape> actual = grapeVine.getGrapes();

        Assert.assertEquals(expected, actual);
    }
}
