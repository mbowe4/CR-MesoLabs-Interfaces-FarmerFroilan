package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Egg implements Edible{

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }
}
