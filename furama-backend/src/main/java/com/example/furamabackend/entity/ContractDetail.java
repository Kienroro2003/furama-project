package com.example.furamabackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Contract.class)
    private Contract contract;

    @ManyToOne(targetEntity = AttachService.class)
    private AttachService attachService;

    private int quantity;

}
