package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CornStalkTest {

    @Test
    public void yieldTest() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.yield();

        List<EarCorn> expected = new ArrayList<>();
        expected.add(new EarCorn());

        List<EarCorn> actual = cornStalk.getEarCorns();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEarCornsTest() {
        CornStalk cornStalk = new CornStalk();

        int expected = 0;
        int actual = cornStalk.getEarCorns().size();

        Assert.assertEquals(expected, actual);
    }
}
