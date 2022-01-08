package com.illusendtech.personapi.repository;

import com.illusendtech.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person, Long> {


}
