package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.entity.Book;
import com.example.SpringDemoPwebProiect.entity.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = "/indexPage")
    public String getIndex(Model model){

        String greetingText = "Hello World!";

        model.addAttribute("greetings", greetingText);
        model.addAttribute("someText", "Some random text");

        return "indexPage";
    }
    @GetMapping(value = "/LogIn")
    public String LogIn(){
        return "LogIn";
    }

    @GetMapping(value = "/HarryPotter")
    public String HarryPotter(){
        return "HarryPotter";
    }

    @GetMapping(value = "/recommendations")
    public String recommendations(){
        return "recommendations";
    }

    @GetMapping(value = "/Martian")
    public String martian(){
        return "Martian";
    }

    @GetMapping(value = "/Outlander")
    public String Outlander(){
        return "Outlander";
    }
}
