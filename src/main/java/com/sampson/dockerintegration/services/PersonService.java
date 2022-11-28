package com.sampson.dockerintegration.services;

import com.sampson.dockerintegration.model.Person;
import com.sampson.dockerintegration.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    public Person getPersonById(long id) {
        return personRepository.findById(id).get();
    }
}
