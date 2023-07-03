package com.example.SpringBoot.controller;
import com.example.SpringBoot.model.Employee;
import com.example.SpringBoot.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class JpaEmployeeController {

    @Autowired
    EmployeeJpaRepository employeeJpaRepository;

    @RequestMapping("/addemp")
    public String addemployee(@RequestBody Employee employee){
        employeeJpaRepository.save(employee);
        return "Employee added successfully";
    }

    @RequestMapping("/viewemp")
    public List<Employee> viewemployee(){
        return employeeJpaRepository.findAll();
    }

    @RequestMapping("/updateemp")
    public String updateemployee(@RequestParam Long id, @RequestParam String name){
        Employee employee=employeeJpaRepository.getById(id);
        employee.setName(name);
        employeeJpaRepository.save(employee);
        return "Employee updated";
    }

    @RequestMapping("/deleteemp")
    public String deleteemployee(@RequestParam Long index){
        employeeJpaRepository.deleteById(index);
        return "Employee deleted";
    }
}
