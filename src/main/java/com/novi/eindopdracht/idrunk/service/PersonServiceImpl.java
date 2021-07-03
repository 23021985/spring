//package com.novi.eindopdracht.idrunk.service;
//
//import com.novi.eindopdracht.idrunk.exception.RecordNotFoundException;
//import com.novi.eindopdracht.idrunk.model.Person;
//import com.novi.eindopdracht.idrunk.repository.PersonRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class PersonServiceImpl implements PersonService{
//
//    @Autowired
//    PersonRepository personRepository;
//    public List<Person> getPersons(){
//        return personRepository.findAll();
//    }
//
//    @Override
//    public Person getPerson(long id) throws RecordNotFoundException {
//        return personRepository.getById(id);
//    }
//
//    @Override
//    public Person addPerson(Person person) {
//        return personRepository.save(person);
//    }
//
//    @Override
//    public void removePerson(long id) throws RecordNotFoundException {
//        personRepository.deleteById(id);
//    }
//
//    @Override
//    public void updatePerson(long id, Person person) throws RecordNotFoundException {
//    }
//}
