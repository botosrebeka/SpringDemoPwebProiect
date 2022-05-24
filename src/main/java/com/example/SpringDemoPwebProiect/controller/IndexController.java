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

        List<Book> bookList = List.of(
                new Book(1,"aa","aa",12345,"1234.12.12"),
                new Book(1,"aa","aa",12345,"1234.12.12"),
                new Book(1,"aa","aa",12345,"1234.12.12")
              );

        model.addAttribute("bookList", bookList);

        List<People> peopleList = List.of(
                new People(1,"first","Last",25),
                new People(1,"first","last", 25),
                new People(1,"first","last", 25)
        );
        model.addAttribute("peopleList",peopleList);
        return "indexPage";
    }
}
