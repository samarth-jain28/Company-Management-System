package com.example.company.Dao;
import java.util.List;
import com.example.company.Entity.Employee;

public interface companyDao {
    void addEmployee();
    List<Employee>selectAll();
}
