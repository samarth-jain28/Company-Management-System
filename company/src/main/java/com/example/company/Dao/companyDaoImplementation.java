package com.example.company.Dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import com.example.company.Entity.Employee;

@Component
public class companyDaoImplementation implements companyDao{
    private EntityManager entityManager;

    @Autowired
    public companyDaoImplementation(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public void addEmployee(){
        
    }

    @Override
    public List<Employee> selectAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }
}
