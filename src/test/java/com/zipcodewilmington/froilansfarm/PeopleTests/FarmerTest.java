package com.zipcodewilmington.froilansfarm.PeopleTests;

import com.zipcodewilmington.froilansfarm.Crops.GrapeVine;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void plantTest() {
        Farmer farmer = new Farmer("Froilan");
        GrapeVine grapeVine = new GrapeVine();
        farmer.plant(grapeVine);

        String expected = "";
        String actual = farmer.getFarm();

        Assert.assertEquals(expected, actual);
    }

}
