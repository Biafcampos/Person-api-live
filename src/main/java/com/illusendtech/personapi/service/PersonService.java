package com.illusendtech.personapi.service;


import com.illusendtech.personapi.dto.response.MessageResponseDTO;
import com.illusendtech.personapi.entity.Person;
import com.illusendtech.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;


    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson( Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID " + savedPerson.getId())
                .build();
    }
}
