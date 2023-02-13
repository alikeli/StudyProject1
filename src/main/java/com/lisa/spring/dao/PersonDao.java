package com.lisa.spring.dao;

import com.lisa.spring.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Component
public class PersonDao {

    private static int PEOPLE_COUNT = 0;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Ivan", 50, "123@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Olga", 15, "456@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Andrey", 52, "789@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Lisa", 31, "asd@gmail.com"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {

        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatePerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatePerson.getName());
        personToBeUpdated.setAge(updatePerson.getAge());
        personToBeUpdated.setEmail(personToBeUpdated.getEmail());


    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }


}
