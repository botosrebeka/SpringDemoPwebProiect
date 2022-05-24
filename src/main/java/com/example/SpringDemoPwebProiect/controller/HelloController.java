package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.model.Book;
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

    @GetMapping(value = "/createEmployee")
    @ResponseBody
    public List<Book> createBook(@RequestParam String title, @RequestParam String author, @RequestParam int isbn){
        return List.of(new Book(title, author, isbn),
                new Book("aa","aa",12345),
                new Book("bb","cc",23456),
                new Book("dd","dd",34567)
                );
    }
}
