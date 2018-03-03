package com.zipcodewilmington.froilansfarm.FarmTests;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void showStableTest() {
        Stable stable = new Stable();
        stable.addHorseToStable();
        stable.addHorseToStable();

        String expected =   "Horse\n" +
                            "Horse\n";
        String actual = stable.showStable();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addHorseToStableTest() {
        Stable stable = new Stable();
        stable.addHorseToStable();

        int expected = 1;
        int actual = stable.getHorseStable().size();

        Assert.assertEquals(expected, actual);
    }
}
