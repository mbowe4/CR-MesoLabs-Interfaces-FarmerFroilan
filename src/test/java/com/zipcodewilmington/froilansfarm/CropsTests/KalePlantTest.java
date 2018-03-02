package com.zipcodewilmington.froilansfarm.CropsTests;


import com.zipcodewilmington.froilansfarm.Crops.Kale;
import com.zipcodewilmington.froilansfarm.Crops.KalePlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KalePlantTest {

    @Test
    public void yieldTest() {
        KalePlant kalePlant = new KalePlant();
        kalePlant.yield();

        List<Kale> expected = new ArrayList<>();
        expected.add(new Kale());

        List<Kale> actual = kalePlant.getKales();

        Assert.assertEquals(expected, actual);
    }
}
