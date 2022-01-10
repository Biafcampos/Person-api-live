package com.illusendtech.personapi.controller;


import com.illusendtech.personapi.dto.response.MessageResponseDTO;
import com.illusendtech.personapi.entity.Person;
import com.illusendtech.personapi.repository.PersonRepository;
import com.illusendtech.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){

        return personService.createPerson(person);
    }
}
