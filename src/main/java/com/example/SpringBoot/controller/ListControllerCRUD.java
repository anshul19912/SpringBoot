package com.example.SpringBoot.controller;

import com.example.SpringBoot.repository.EmployeeJpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ListControllerCRUD {

    ArrayList<String> courselist= new ArrayList<>();

    //create or add endpoint
    @RequestMapping("/addtolist")
    public String add(@RequestParam String element){
        courselist.add(element);
        return "Element added to course "+element;
    }

    //read or get endpoint
    @RequestMapping("getlist")
    public ArrayList<String >read(){
        return courselist;
    }

    @RequestMapping("/update")
    public String update(@RequestParam int index, @RequestParam String element){
        courselist.set(index,element);
        return "Element Updated "+element;
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam int index){
        courselist.remove(index);
        return "Element removed successfully";
    }


}
