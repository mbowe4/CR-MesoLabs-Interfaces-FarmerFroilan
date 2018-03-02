package com.zipcodewilmington.froilansfarm.AnimalsTests;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void makeNoiseTest() {
        Horse horse = new Horse();

        String expected = "Neigh";
        String actual = horse.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        Horse horse = new Horse();
        EarCorn earCorn = new EarCorn();

        horse.eat(earCorn);

        Assert.assertTrue(horse.hasEaten());
    }
}