package com.lisa.spring.dao;

import com.lisa.spring.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
public class PersonDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Person> index() {
        Session session = sessionFactory.getCurrentSession();
        List<Person> people = session.createQuery("select p from Person p", Person.class)
                .getResultList();

        return people;
    }

    public Optional<Person> show(String email) {
        return null;
    }

    public Person show(int id) {
        return null;
    }


    public void save(Person person) {

    }

    public void update(int id, Person updatePerson) {

    }


    public void delete(int id) {


    }


//    public void testMultipleUpdate() {
//        List<Person> people = create1000People();
//
//        long before = System.currentTimeMillis();
//
//        for (Person person : people) {
//            jdbcTemplate.update("INSERT INTO Person VALUES(?, ?, ?, ?)", person.getId(), person.getName(), person.getAge(),
//                    person.getEmail());
//        }
//
//        long after = System.currentTimeMillis();
//        System.out.println("Time: " + (after - before));
//    }
//
//    public void testButchUpdate() {
//        List<Person> people = create1000People();
//
//        long before = System.currentTimeMillis();
//
//        jdbcTemplate.batchUpdate("INSERT INTO Person VALUES(?, ?, ?, ?)",
//                new BatchPreparedStatementSetter() {
//                    @Override
//                    public void setValues(PreparedStatement ps, int i) throws SQLException {
//                        ps.setInt(1, people.get(i).getId());
//                        ps.setString(2, people.get(i).getName());
//                        ps.setInt(3, people.get(i).getAge());
//                        ps.setString(4, people.get(i).getEmail());
//                    }
//
//                    @Override
//                    public int getBatchSize() {
//                        return people.size();
//                    }
//                });
//
//        long after = System.currentTimeMillis();
//        System.out.println("Time: " + (after - before));
//    }
//
//    private List<Person> create1000People() {
//        List<Person> people = new ArrayList<>();
//
//        for (int i = 0; i < 1000; i++)
//            people.add(new Person(i, "Name" + i, 30, "test" + i + "@mail.ru", "some address"));
//
//        return people;
//    }

}
