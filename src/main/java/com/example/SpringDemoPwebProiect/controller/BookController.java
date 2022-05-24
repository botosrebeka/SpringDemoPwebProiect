package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    @GetMapping(value = "/books")
    public String getIndex(Model model){
        List<Book> bookList = List.of(
                new Book(1,"aa","aa",12345,"1234.12.12"),
                new Book(1,"aa","aa",12345,"1234.12.12"),
                new Book(1,"aa","aa",12345,"1234.12.12")
        );

        model.addAttribute("bookList", bookList);
        return "books";
    }
}
