package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.Strawberry;
import com.zipcodewilmington.froilansfarm.Crops.StrawberryBush;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StrawberryBushTest {

    @Test
    public void yieldWhileFertilizedTest() {
        StrawberryBush strawberryBush = new StrawberryBush();
        strawberryBush.setHasBeenFertilized(true);
        strawberryBush.yield();

        List<Strawberry> expected = new ArrayList<>();
        expected.add(new Strawberry());

        List<Strawberry> actual = strawberryBush.getStrawberries();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yieldWhileUnfertililzedTest() {
        StrawberryBush strawberryBush = new StrawberryBush();
        strawberryBush.setHasBeenFertilized(false);
        strawberryBush.yield();

        List<Strawberry> expected = new ArrayList<>();

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

