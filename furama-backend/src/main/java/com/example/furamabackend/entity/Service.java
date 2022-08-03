package com.example.furamabackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 45)
    private String serviceName;
    private int serviceArea;
    private double serviceCost;
    private int serviceMaxPeople;
    @Column(length = 45)
    private String standardRoom;
    private String descriptionOtherConvenience;
    private double poolArea;
    private int numberOfFloors;

    @ManyToOne(targetEntity = ServiceType.class)
    private ServiceType serviceType;

    @ManyToOne(targetEntity = RentType.class)
    private RentType rentType;
}
