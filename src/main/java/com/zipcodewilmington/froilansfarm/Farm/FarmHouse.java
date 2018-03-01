package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.People.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private List<Person> people;


    public FarmHouse() {
        this.people = new ArrayList<Person>();
    }

    public String getPeople() {
        StringBuilder builder = new StringBuilder();
        for(Person person: people) {
            builder.append(person);
        }
        return builder.toString();
    }
}
