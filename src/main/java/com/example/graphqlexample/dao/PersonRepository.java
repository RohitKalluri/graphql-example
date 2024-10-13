package com.example.graphqlexample.dao;

import com.example.graphqlexample.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {


    Person findByEmail(String email);
}
