package com.example.company.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department_location")
public class DepartmentLocation {
    
    @Id
    @Column(name = "dnumber")
    private Integer Dnumber;

    @Column(name = "dlocation")
    private Integer Dlocation;

    
}
