package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.dto.ReadDto;
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

import java.util.List;

@Controller
public class ReadController {

    @Autowired
    ReadService service;

    @GetMapping(value = "/reads")
    public String getIndex(Model model){
        List<ReadDto> readDtoList = service.getReadList();
        model.addAttribute("readList", service.getReadList());
        return "reads";
    }

    @GetMapping(value = "/addRead")
    public String createRead(Model model){
        ReadDto readDto = new ReadDto();
        model.addAttribute("read", readDto);
        return "addRead";
    }

    @PostMapping(value = "/submitRead")
    public String submitRead(@ModelAttribute ReadDto readDto){
        service.saveRead(readDto);
        return "redirect:/reads";
    }

    @PostMapping(value = "/deleteRead")
    public String deleteRead(@RequestParam("idr") Read idr){
        service.deleteRead(idr);
        return  "redirect:/reads";
    }

    @PostMapping(value = "/editRead")
    public String editRead(@RequestParam("idr") int idr, Model model){
        ReadDto readDto = service.findReadById(idr);
        model.addAttribute("read",readDto);
        return "addRead";
    }
}
