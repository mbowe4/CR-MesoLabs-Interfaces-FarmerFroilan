package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.People.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private final List<Person> people;


    public FarmHouse() {
        this.people = new ArrayList<>();
    }

    public void addPersonToFarmHouse(Person personToAdd) {
        people.add(personToAdd);
    }

    public String showPeople() {
        StringBuilder builder = new StringBuilder();
        for(Person person: people) {
            builder.append(person + "\n");
        }
        return builder.toString();
    }

    public List<Person> getPeople() {
        return people;
    }
}
