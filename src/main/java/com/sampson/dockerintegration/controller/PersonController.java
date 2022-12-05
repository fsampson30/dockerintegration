package com.sampson.dockerintegration.controller;

import com.sampson.dockerintegration.model.Person;
import com.sampson.dockerintegration.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getPerson(){
        return personService.getAllPersons();
    }

   /* @GetMapping
    public Person getPersonById(@RequestParam long id){
        return personService.getPersonById(id);
    }*/
}
