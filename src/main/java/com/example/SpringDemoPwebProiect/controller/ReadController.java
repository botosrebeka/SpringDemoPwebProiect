package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.entity.Book;
import com.example.SpringDemoPwebProiect.entity.Read;
import com.example.SpringDemoPwebProiect.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReadController {

    @Autowired
    ReadService service;

    @GetMapping(value = "/reads")
    public String getIndex(Model model){
        model.addAttribute("readList", service.getReadList());
        return "reads";
    }

    @GetMapping(value = "/addRead")
    public String createRead(Model model){
        Read read = new Read();
        model.addAttribute("read", read);
        return "addRead";
    }

    @PostMapping(value = "/submitRead")
    public String submitRead(@ModelAttribute Read read){
        service.saveRead(read);
        return "redirect:/reads";
    }

    @PostMapping(value = "/deleteRead")
    public String deleteRead(@RequestParam("id") Read id){
        service.deleteRead(id);
        return  "redirect:/reads";
    }

    @PostMapping(value = "/editRead")
    public String editRead(@RequestParam("id") int id, Model model){
        Read read = service.findReadById(id);
        model.addAttribute("read",read);
        return "addRead";
    }
}
