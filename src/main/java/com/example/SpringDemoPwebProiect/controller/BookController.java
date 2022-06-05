package com.example.SpringDemoPwebProiect.controller;

import com.example.SpringDemoPwebProiect.dto.BookDto;
import com.example.SpringDemoPwebProiect.entity.Book;
import com.example.SpringDemoPwebProiect.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService service;

    @GetMapping(value = "/books")
    public String getIndex(Model model){
        List<BookDto> bookDtoList = service.getBookList();
        model.addAttribute("bookList", bookDtoList);
        return "books";
    }

    @GetMapping(value = "/addBook")
    public String createBook(Model model){
        BookDto bookDto = new BookDto();
        model.addAttribute("book", bookDto);
        return "addBook";
    }

    @PostMapping(value = "/submitBook")
    public String submitBook(@ModelAttribute BookDto bookDto){
        service.saveBook(bookDto);
        return "redirect:/books";
    }

    @PostMapping(value = "/deleteBook")
    public String deleteBook(@RequestParam("idb") Book idb){
        service.deleteBook(idb);
        return  "redirect:/books";
    }

    @PostMapping(value = "/editBook")
    public String editBook(@RequestParam("idb") int idb, Model model){
        BookDto bookDto = service.findBookByIdb(idb);
        model.addAttribute("book",bookDto);
        return "addBook";
    }
}
