//package com.lisa.spring.util;
//
//import com.lisa.spring.dao.PersonDao;
//import com.lisa.spring.model.Person;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//@Component
//public class PersonValidator implements Validator {
//    private final PersonDao personDao;
//
//    @Autowired
//    public PersonValidator(PersonDao personDao) {
//        this.personDao = personDao;
//    }
//
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return Person.class.equals(clazz);
//    }
//
////    @Override
////    public void validate(Object o, Errors errors) {
////        Person person = (Person) o;
////
////        if (personDao.show(person.getEmail()).isPresent()) {
////            errors.rejectValue("email", "","This email is already taken");
////        }
////    }
//}
