package com.zipcodewilmington.froilansfarm.FarmTests;

import com.zipcodewilmington.froilansfarm.Farm.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    @Test
    public void showChickenCoopTest() {
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.addChickenToChickenCoop();
        chickenCoop.addChickenToChickenCoop();
        chickenCoop.addChickenToChickenCoop();

        String expected = "Chicken\n" +
                        "Chicken\n" +
                        "Chicken\n";
        String actual = chickenCoop.showChickenCoop();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addChickenToChickenCoopTest() {
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.addChickenToChickenCoop();

        int expected = 1;
        int actual = chickenCoop.getChickens().size();

        Assert.assertEquals(expected, actual);
    }
}
