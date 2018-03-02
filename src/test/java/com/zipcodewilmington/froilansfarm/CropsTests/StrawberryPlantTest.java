package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.Strawberry;
import com.zipcodewilmington.froilansfarm.Crops.StrawberryBush;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StrawberryPlantTest {

    @Test
    public void yieldTest() {
        StrawberryBush strawberryBush = new StrawberryBush();
        strawberryBush.yield();

        List<Strawberry> expected = new ArrayList<>();
        expected.add(new Strawberry());

        List<Strawberry> actual = strawberryBush.getStrawberries();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStrawberriesTest() {
        StrawberryBush strawberryBush = new StrawberryBush();

        int expected = 0;
        int actual = strawberryBush.getStrawberries().size();

        Assert.assertEquals(expected, actual);
    }
}

