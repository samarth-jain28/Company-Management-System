package com.example.company.Entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

    @Column(name = "dname")
    private String Dname;

    @Id
    @Column(name = "dnumber")
    private Integer Dnumber;

    @Column(name = "mgr_ssn")
    private Integer MgrSsn;

    @Column(name = "mgr_start_date")
    private Date MgrStartDate;
    
    public Department() {
    }

    public Department(String dname, Integer dnumber, Integer mgrSsn, Date mgrStartDate) {
        Dname = dname;
        Dnumber = dnumber;
        MgrSsn = mgrSsn;
        MgrStartDate = mgrStartDate;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public Integer getDnumber() {
        return Dnumber;
    }

    public void setDnumber(Integer dnumber) {
        Dnumber = dnumber;
    }

    public Integer getMgrSsn() {
        return MgrSsn;
    }

    public void setMgrSsn(Integer mgrSsn) {
        MgrSsn = mgrSsn;
    }

    public Date getMgrStartDate() {
        return MgrStartDate;
    }

    public void setMgrStartDate(Date mgrStartDate) {
        MgrStartDate = mgrStartDate;
    }

    @Override
    public String toString() {
        return "Department [Dname=" + Dname + ", Dnumber=" + Dnumber + ", MgrSsn=" + MgrSsn + ", MgrStartDate="
                + MgrStartDate + "]";
    }
    
}
