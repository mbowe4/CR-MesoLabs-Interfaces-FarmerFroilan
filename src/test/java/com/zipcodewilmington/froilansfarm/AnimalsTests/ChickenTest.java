package com.zipcodewilmington.froilansfarm.AnimalsTests;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Egg;
import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ChickenTest {

    @Test
    public void makeNoiseTest(){
        Chicken chicken = new Chicken();

        String expected = "Caw";
        String actual = chicken.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yieldTest() {
        Chicken chicken = new Chicken();
        chicken.yield();

        List<Egg> expected = new ArrayList<>();
        expected.add(new Egg());

        List<Egg> actual = chicken.getEggs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        Chicken chicken = new Chicken();
        EarCorn earCorn = new EarCorn();

        chicken.eat(earCorn);

        Assert.assertTrue(chicken.hasEaten());
    }



}
