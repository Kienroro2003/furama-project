package com.example.furamabackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

@Entity
@Data
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime contractStartDate;
    private LocalDateTime contractEndDate;
    private double contractDeposit;
    private double contractTotalMoney;

    @ManyToOne(targetEntity = Employee.class)
    private Employee employee;

    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;

    @OneToMany(mappedBy = "contract")
    private Set<ContractDetail> contractDetails;


}
