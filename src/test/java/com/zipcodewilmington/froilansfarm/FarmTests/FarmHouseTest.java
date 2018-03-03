package com.zipcodewilmington.froilansfarm.FarmTests;

import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void showPeopleTest() {
        FarmHouse farmHouse = new FarmHouse();
        Farmer farmer1 = new Farmer("Froilan");
        Farmer farmer2 = new Farmer("Froilanda");

        farmHouse.addPersonToFarmHouse(farmer1);
        farmHouse.addPersonToFarmHouse(farmer2);

        String expected =   "Farmer Froilan\n" +
                            "Farmer Froilanda\n";
        String actual = farmHouse.showPeople();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPersonToFarmHouseTest() {
        FarmHouse farmHouse = new FarmHouse();
        Farmer farmer1 = new Farmer("Froilan");
        Farmer farmer2 = new Farmer("Froilanda");

        farmHouse.addPersonToFarmHouse(farmer1);
        farmHouse.addPersonToFarmHouse(farmer2);

        int expected = 2;
        int actual = farmHouse.getPeople().size();

        Assert.assertEquals(expected, actual);
    }
}
