package com.zipcodewilmington.froilansfarm.AnimalsTests;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Egg;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import org.junit.Assert;
import org.junit.Test;


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

        Object expected = new Egg().getClass().getSimpleName();
        Object actual = chicken.yield().getClass().getSimpleName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        Chicken chicken = new Chicken();
        EarCorn earCorn = new EarCorn();

        String expected = "Chicken ate a EarCorn.";
        String actual = chicken.eat(earCorn);

        Assert.assertEquals(expected, actual);
    }



}
