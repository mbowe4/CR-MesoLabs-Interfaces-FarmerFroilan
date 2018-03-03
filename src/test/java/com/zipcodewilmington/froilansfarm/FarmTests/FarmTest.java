package com.zipcodewilmington.froilansfarm.FarmTests;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.GrapeVine;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Farm.Stable;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    @Test
    public void getStablesTest() {
        Farm farm = new Farm();

        Stable stable1 = new Stable();
        stable1.addHorseToStable();
        stable1.addHorseToStable();

        Stable stable2 = new Stable();
        stable2.addHorseToStable();

        farm.getStables().add(stable1);
        farm.getStables().add(stable2);


        String expected =   "Horse\n" +
                            "Horse\n" +
                            "\n" +
                            "Horse\n" +
                            "\n";
        String actual = farm.showStables();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChickenCoopsTest() {
        Farm farm = new Farm();

        ChickenCoop chickenCoop1 = new ChickenCoop();
        chickenCoop1.addChickenToChickenCoop();
        chickenCoop1.addChickenToChickenCoop();
        chickenCoop1.addChickenToChickenCoop();

        ChickenCoop chickenCoop2 = new ChickenCoop();
        chickenCoop2.addChickenToChickenCoop();
        chickenCoop2.addChickenToChickenCoop();
        chickenCoop2.addChickenToChickenCoop();

        farm.getChickenCoops().add(chickenCoop1);
        farm.getChickenCoops().add(chickenCoop2);

        String expected =   "Chicken\n" +
                            "Chicken\n" +
                            "Chicken\n" +
                            "\n" +
                            "Chicken\n" +
                            "Chicken\n" +
                            "Chicken\n" +
                            "\n";
        String actual = farm.showChickenCoops();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFarmHouseTest() {
        Farm farm = new Farm();

        FarmHouse farmHouse = new FarmHouse();
        Farmer farmer = new Farmer("Froilan");
        Pilot pilot = new Pilot("Froilanda");

        farm.getFarmHouse().addPersonToFarmHouse(farmer);
        farm.getFarmHouse().addPersonToFarmHouse(pilot);

        String expected =   "Farmer Froilan\n" +
                            "Pilot Froilanda\n";
        String actual = farm.showFarmHouse();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFieldTest() {
        Farm farm = new Farm();

        CropRow cropRow1 = new CropRow();
        cropRow1.add(new TomatoPlant());
        cropRow1.add(new TomatoPlant());

        CropRow cropRow2 = new CropRow();
        cropRow2.add(new GrapeVine());
        cropRow2.add(new GrapeVine());

        farm.getField().add(cropRow1);
        farm.getField().add(cropRow2);

        String expected =   "TomatoPlant\n" +
                            "TomatoPlant\n" +
                            "GrapeVine\n" +
                            "GrapeVine\n";
        String actual = farm.getFieldString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void showFarmTest() {
        Farm farm = new Farm();

        // Stables
        Stable stable1 = new Stable();
        stable1.addHorseToStable();
        stable1.addHorseToStable();
        Stable stable2 = new Stable();
        stable2.addHorseToStable();
        farm.getStables().add(stable1);
        farm.getStables().add(stable2);

        // ChickenCoops
        ChickenCoop chickenCoop1 = new ChickenCoop();
        chickenCoop1.addChickenToChickenCoop();
        chickenCoop1.addChickenToChickenCoop();
        chickenCoop1.addChickenToChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        chickenCoop2.addChickenToChickenCoop();
        chickenCoop2.addChickenToChickenCoop();
        chickenCoop2.addChickenToChickenCoop();
        farm.getChickenCoops().add(chickenCoop1);
        farm.getChickenCoops().add(chickenCoop2);

        // FarmHouse
        FarmHouse farmHouse = new FarmHouse();
        Farmer farmer = new Farmer("Froilan");
        Pilot pilot = new Pilot("Froilanda");
        farm.getFarmHouse().addPersonToFarmHouse(farmer);
        farm.getFarmHouse().addPersonToFarmHouse(pilot);

        // Field
        CropRow cropRow1 = new CropRow();
        cropRow1.add(new TomatoPlant());
        cropRow1.add(new TomatoPlant());
        CropRow cropRow2 = new CropRow();
        cropRow2.add(new GrapeVine());
        cropRow2.add(new GrapeVine());
        farm.getField().add(cropRow1);
        farm.getField().add(cropRow2);

        String expected =   "Chicken Coops: \n" +
                            "Chicken\n" +
                            "Chicken\n" +
                            "Chicken\n" +
                            "\n" +
                            "Chicken\n" +
                            "Chicken\n" +
                            "Chicken\n" +
                            "\n" +
                            "\n" +
                            "Farm House: \n" +
                            "Farmer Froilan\n" +
                            "Pilot Froilanda\n" +
                            "\n" +
                            "Field: \n" +
                            "TomatoPlant\n" +
                            "TomatoPlant\n" +
                            "GrapeVine\n" +
                            "GrapeVine\n" +
                            "\n" +
                            "Stables: \n" +
                            "Horse\n" +
                            "Horse\n" +
                            "\n" +
                            "Horse\n" +
                            "\n";
        String actual = farm.showFarm();
        System.out.println(farm.showFarm());

        Assert.assertEquals(expected, actual);
    }
}
