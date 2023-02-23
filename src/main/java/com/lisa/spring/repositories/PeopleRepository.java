package com.lisa.spring.repositories;

import com.lisa.spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

    List<Person> findAllByName(String name);

    List<Person> findByNameOrderByAge(String name);

    List<Person> findByEmail(String name);

    List<Person> findByNameStartingWith(String startWith);

    List<Person> findByNameOrEmail(String name, String email);
}
