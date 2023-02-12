package com.lisa.spring.dao;

import com.lisa.spring.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@Component
public class PersonDao {

    private static int PEOPLE_COUNT=0;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Ivan"));
        people.add(new Person(++PEOPLE_COUNT, "Olga"));
        people.add(new Person(++PEOPLE_COUNT, "Andrey"));
        people.add(new Person(++PEOPLE_COUNT, "Lisa"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {

        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }


}
