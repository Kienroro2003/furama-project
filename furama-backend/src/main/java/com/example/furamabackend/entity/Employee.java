package com.example.furamabackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeName;
    private Date employeeBirthday;
    private String employeeIdCard;
    private double employeeSalary;
    private String employeePhone;
    private String employeeEmail;
    private String employeeAddress;

    @ManyToOne(targetEntity = Position.class)
    private Position position;

    @ManyToOne(targetEntity = EducationDegree.class)
    private EducationDegree educationDegree;

    @ManyToOne(targetEntity = Division.class)
    private Division division;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;
}
