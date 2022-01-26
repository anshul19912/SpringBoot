package com.example.SpringBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
            @GeneratedValue
            Long id;
    @Column(name="Emp_Name")
    String name;
    int emp_id;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int emp_id, double salary){
        this.name=name;
        this.emp_id=emp_id;
        this.salary=salary;


    }

    //Default Constructor
    public Employee(){
    }
}

