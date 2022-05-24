package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.entity.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PeopleController {

    @GetMapping(value = "/people")
    public String getIndex(Model model){
        List<People> peopleList = List.of(
                new People(1,"first","Last",25),
                new People(1,"first","last", 25),
                new People(1,"first","last", 25)
        );
        model.addAttribute("peopleList",peopleList);
        return "people";
    }
}
