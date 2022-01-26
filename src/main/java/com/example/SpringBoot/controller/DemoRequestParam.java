package com.example.SpringBoot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8081/addition?a=12&b=13
@RestController
public class DemoRequestParam {

    @RequestMapping("/addition")
    public String addition(@RequestParam int a, @RequestParam int b){
        int result=a+b;
        return "Addition of a and b is = " +result;
    }

    @RequestMapping("/subtraction")
    public String subtraction(@RequestParam int a, @RequestParam int b){
        int result=a-b;
        return "Subtraction of a and b is = " +result;
    }

    @RequestMapping("/multiplication")
    public String multiplication(@RequestParam int a, @RequestParam int b){
        int result = a * b;
        return "Multiplication of a and b is = " + result;
    }

    @RequestMapping("/division")
    public String divide(@RequestParam int a, @RequestParam int b){
        int div=a/b;
        return "Division of a and b is = " +div;
    }
}
