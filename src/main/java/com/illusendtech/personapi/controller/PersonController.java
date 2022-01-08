package com.illusendtech.personapi.controller;


import com.illusendtech.personapi.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @GetMapping
    public  String getBook(){
        return "API Test!";
    }
}
