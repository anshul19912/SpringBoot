package com.example.SpringBoot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    int a = 15, b = 3;

    @RequestMapping("/add")
    public String addition(){
        int result=a+b;
        return "Addition of a and b is = " +result;
    }

    @RequestMapping("/sub")
    public String subtraction(){
        int result=a-b;
        return "Subtraction of a and b is = " +result;
    }

    @RequestMapping("/mul")
    public String multiplication(){
        int result = a * b;
        return "Multiplication of a and b is = " + result;
    }

    @RequestMapping("/div")
    public String divide(){
        int div=a/b;
        return "Division of a and b is = " +div;
    }
}
