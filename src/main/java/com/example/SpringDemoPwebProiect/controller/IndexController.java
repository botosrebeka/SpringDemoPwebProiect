package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.model.Book;
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
              new Book("asd","sd",123),
              new Book("asd","sd",123),
              new Book("asd","sd",123)
              );

        model.addAttribute("bookList", bookList);

        return "indexPage";
    }
}
