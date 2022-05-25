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

    @GetMapping(value = "/createBooks")
    @ResponseBody
    public List<Book> createBook(@RequestParam int id,@RequestParam String title, @RequestParam String author, @RequestParam int isbn, @RequestParam String release_date){
        return List.of(new Book(id,title, author, isbn,release_date),
                new Book(1,"aa","aa",12345,"1234.56.78"),
                new Book(1,"aa","aa",12345,"1234.12.12"),
                new Book(1,"aa","aa",12345,"1234.12.12")
                );
    }

    @GetMapping(value = "/createPeople")
    @ResponseBody
    public List<People> createPeople(@RequestParam int id, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age){
        return List.of(new People(id, firstname, lastname, age),
                new People(1,"first","last", 25),
                new People(1,"first","last", 25),
                new People(1,"first","last", 25)
                );
    }
}
