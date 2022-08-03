package com.example.furamabackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerTypeName;

    @OneToMany(mappedBy = "customerType")
    private Set<Customer> customers;
}
