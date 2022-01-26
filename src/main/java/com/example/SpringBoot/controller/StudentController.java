package com.example.SpringBoot.controller;

import com.example.SpringBoot.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    ArrayList<Student> studentArrayList=new ArrayList<>();

    @RequestMapping("/addstudent")
    public String addstudent(){
        Student s1= new Student("Anshul Singh",19,"Information Technology");
        Student s2= new Student("Tania ",22,"MBA");
        studentArrayList.add(s1);
        studentArrayList.add(s2);

        return "Student added Successfully";
    }

    @RequestMapping("/viewstudent")
    public ArrayList<Student> viewstudent(){
        return studentArrayList;
    }

    @RequestMapping("/updatestudent")
    public String updatestudent(@RequestParam int index,@RequestParam String name){
        studentArrayList.get(index).setName(name);

        return "Student updated successfully ";
    }

    @RequestMapping("/deletestudent")
    public String deletestudent(@RequestParam int index){
        studentArrayList.remove(index);
        return "Student removed successfully";
    }
}
