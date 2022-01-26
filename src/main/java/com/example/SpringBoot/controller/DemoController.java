package com.example.SpringBoot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    //EndPoint 1
    @RequestMapping("/hello")
    public void hello(){
        System.out.println("Hello from Spring Boot");
    }

    //EndPoint 2
    @RequestMapping("/message")
    public String message(){
        return "Hello from message method";
    }

    //EndPoint 3
    @RequestMapping("/course")
    public List<String> names(){
        ArrayList<String> name= new ArrayList<>();
        name.add("Java");
        name.add("Spring Boot");
        name.add("Spring");
        name.add("Cloud and MS");

        return name;
    }
}
