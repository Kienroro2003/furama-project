package com.example.furamabackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
@Entity
@Data
public class RentType {
    @Id
    private Long id;
    @Column(length = 45)
    private String rentTypeName;

    @OneToMany(mappedBy = "serviceType")
    private Set<Service> services;
}
