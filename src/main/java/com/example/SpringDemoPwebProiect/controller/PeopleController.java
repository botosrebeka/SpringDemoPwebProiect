package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.dto.PeopleDto;
import com.example.SpringDemoPwebProiect.entity.People;
import com.example.SpringDemoPwebProiect.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PeopleController {

    @Autowired
    PeopleService service;

    @GetMapping(value = "/people")
    public String getIndex(Model model){
        List<PeopleDto> peopleDtoList = service.getPeopleList();
        model.addAttribute("peopleList",service.getPeopleList());

        return "people";
    }

    @GetMapping(value = "/addPeople")
    public String createPeople(Model model){
        PeopleDto peopleDto = new PeopleDto();
        model.addAttribute("people", peopleDto);
        return "addPeople";
    }

    @PostMapping(value = "/submitPeople")
    public String submitPeople(@ModelAttribute PeopleDto peopleDto){
        service.savePeople(peopleDto);
        return "redirect:/people";
    }

    @PostMapping(value = "/deletePeople")
    public String deletePeople(@RequestParam("idp") People idp){
        service.deletePeople(idp);
        return "redirect:/people";
    }

    @PostMapping(value = "/editPeople")
    public String editPeople(@RequestParam("idp") int idp, Model model){
        PeopleDto peopleDto = service.findPeopleByIdp(idp);
        model.addAttribute("people",peopleDto);
        return "addPeople";
    }

    @PostMapping(value = "logInPeople")
    public String logInPeople(){
        boolean people = service.login();
        if(people){return "redirect:/indexPage";}
        return "redirect:/indexPage";
    }
}
