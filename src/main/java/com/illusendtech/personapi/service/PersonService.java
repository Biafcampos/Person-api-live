package com.illusendtech.personapi.service;


import com.illusendtech.personapi.dto.request.PersonDTO;
import com.illusendtech.personapi.dto.response.MessageResponseDTO;
import com.illusendtech.personapi.entity.Person;
import com.illusendtech.personapi.mapper.PersonMapper;
import com.illusendtech.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson( PersonDTO personDTO){
       Person personToSave = personMapper.toModel(personDTO);


        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID " + savedPerson.getId())
                .build();
    }
}
