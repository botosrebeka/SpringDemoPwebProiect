package com.example.SpringDemoPwebProiect.service;

import com.example.SpringDemoPwebProiect.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList(){
        return bookList;
    }

    public void save(Book book){
        bookList.add(book);
    }
}
