package com.example.furamabackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 45)
    private String customerName;
    private Date customerBirthday;
    private boolean customerGender;
    @Column(length = 45)
    private String customerIdCard;
    @Column(length = 45)
    private String customerPhone;
    @Column(length = 45)
    private String customerEmail;
    @Column(length = 45)
    private String customerAddress;

    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerType;
}
