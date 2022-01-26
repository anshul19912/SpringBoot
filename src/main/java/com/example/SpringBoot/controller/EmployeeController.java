package com.example.SpringBoot.controller;


import com.example.SpringBoot.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class  EmployeeController {

    ArrayList<Employee> employeeArrayList= new ArrayList<>();

    @RequestMapping("/addemployee")
    public String addemployee(@RequestBody Employee employee){
        employeeArrayList.add(employee);
        return "Student added successfully";
    }

    @RequestMapping("/viewemployee")
    public ArrayList<Employee> viewemployee(){
        return employeeArrayList;
    }

    @RequestMapping("/updateemployee")
    public String updateemployee(@RequestParam int index,@RequestParam String name){
        employeeArrayList.get(index).setName(name);
        return "Employee updated";
    }

    @RequestMapping("/deleteemployee")
    public String deleteemployee(@RequestParam int index){
        employeeArrayList.remove(index);
        return "Employee deleted";
    }


}
