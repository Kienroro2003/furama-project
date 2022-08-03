package com.example.furamabackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String educationDegreeName;

    @OneToMany(mappedBy = "educationDegree")
    private Set<Employee> employees;

}
