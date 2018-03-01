package com.zipcodewilmington.froilansfarm.CropsTests;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void yieldTest() {
        CornStalk cornStalk = new CornStalk();

        Object expected = new EarCorn().getClass().getSimpleName();
        Object actual = cornStalk.yield().getClass().getSimpleName();

        Assert.assertEquals(expected, actual);
    }
}
