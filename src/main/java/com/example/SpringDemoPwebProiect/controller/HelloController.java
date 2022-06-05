package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.entity.Book;
import com.example.SpringDemoPwebProiect.entity.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @GetMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello(){
        return "hello word!";
    }

    @GetMapping(value = "/printParam")
    @ResponseBody
    public String printParam(@RequestParam String name){
        return "hello" +name + "!";
    }

}
