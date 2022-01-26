package com.example.SpringBoot.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8081/div/45/15
@RestController
public class DemoPathVariable {

    @RequestMapping("/add/{a}/{b}")
    public String addition(@PathVariable int a, @PathVariable int b){
        int result=a+b;
        return "Addition of a and b is = " +result;
    }

    @RequestMapping("/sub/{a}/{b}")
    public String subtraction(@PathVariable int a, @PathVariable int b){
        int result=a-b;
        return "Subtraction of a and b is = " +result;
    }

    @RequestMapping("/mul/{a}/{b}")
    public String multiplication(@PathVariable int a, @PathVariable int b){
        int result = a * b;
        return "Multiplication of a and b is = " + result;
    }

    @RequestMapping("/div/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b){
        int div=a/b;
        return "Division of a and b is = " +div;
    }
}
