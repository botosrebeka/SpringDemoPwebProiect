package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.entity.Book;
import com.example.SpringDemoPwebProiect.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    BookService service;

    @GetMapping(value = "/books")
    public String getIndex(Model model){
        model.addAttribute("bookList", service.getBookList());
        return "books";
    }

    @GetMapping(value = "/addBook")
    public String createBook(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "addBook";
    }

    @PostMapping(value = "/submitBook")
    public String submitBook(@ModelAttribute Book book){
        service.saveBook(book);
        return "redirect:/books";
    }
}
