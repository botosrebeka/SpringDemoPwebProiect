package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.entity.People;
import com.example.SpringDemoPwebProiect.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeopleController {

    @Autowired
    PeopleService service;

    @GetMapping(value = "/people")
    public String getIndex(Model model){
        model.addAttribute("peopleList",service.getPeopleList());
        return "people";
    }

    @GetMapping(value = "/addPeople")
    public String createPeople(Model model){
        People people = new People();
        model.addAttribute("people", people);
        return "addPeople";
    }

    @PostMapping(value = "/submitPeople")
    public String submitPeople(@ModelAttribute People people){
        service.savePeople(people);
        return "redirect:/people";
    }

    @PostMapping(value = "/deletePeople")
    public String deletePeople(@RequestParam("idp") People idp){
        service.deletePeople(idp);
        return "redirect:/people";
    }

    @PostMapping(value = "/editPeople")
    public String editPeople(@RequestParam("idp") int idp, Model model){
        People people = service.findPeopleByIdp(idp);
        model.addAttribute("people",people);
        return "addPeople";
    }
}
