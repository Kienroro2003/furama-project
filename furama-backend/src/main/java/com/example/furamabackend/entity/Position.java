package com.example.furamabackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String positionName;

    @OneToMany(mappedBy = "position")
    private Set<Employee> employees;
}
