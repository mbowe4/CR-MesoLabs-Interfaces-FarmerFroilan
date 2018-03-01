package com.zipcodewilmington.froilansfarm.AnimalsTests;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
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

        String expected = "Horse ate a EarCorn.";
        String actual = horse.eat(earCorn);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHasEatenTest() {
        Horse horse = new Horse();

        Boolean expected = false;
        Boolean actual = horse.getHasEaten();

        Assert.assertEquals(expected, actual);
    }
}
