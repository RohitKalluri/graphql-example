package com.example.graphqlexample.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class Person {

    @Id
    private int id;
    private String name;
    private String mobile;
    private String email;
    @ElementCollection
    private List<String> address;
}
