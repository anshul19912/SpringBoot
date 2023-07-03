package com.example.SpringBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name= "Student_Table")               // to make Modal class as table
public class Student {
    @Id                                     // to set as primary key
    @GeneratedValue                          // Automatic value increment
    Long id;
    @Column(name="Student_Name")
    String name;
    int age;
    String section;



    public Student(String name, int age, String section){
        this.name=name;
        this.age=age;
        this.section=section;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSection(){
        return section;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSection(String section){
        this.section=section;
    }

    public Student() {                  // default constructor
    }
}
