package com.example.company.Rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.Entity.Employee;
import com.example.company.Dao.companyDao;

@RestController
@RequestMapping("/api")
public class CompanyRestController {

    private companyDao CompanyDao;
    @Autowired
    CompanyRestController(@Qualifier("companyDaoImplementation") companyDao CompanyDao){
        this.CompanyDao = CompanyDao;
    }
 
    @GetMapping("/employees")
    private List<Employee> selectAll(){
        List<Employee> emp = CompanyDao.selectAll();
        return emp;
    }

    @GetMapping("/about")
    private String about(){
        return "Hello World!";
    }
}
