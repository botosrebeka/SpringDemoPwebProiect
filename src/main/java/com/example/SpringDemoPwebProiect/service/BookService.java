package com.example.SpringDemoPwebProiect.service;

import com.example.SpringDemoPwebProiect.entity.Book;
import com.example.SpringDemoPwebProiect.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBookList(){
        return bookRepository.findAll();
    }

    public void saveBook(Book book){
        bookRepository.save(book);
    }

    public void deleteBook(Book book){
        bookRepository.delete(book);
    }

    public Book findBookByIdb(int idb){
        return bookRepository.findById(idb).get();
    }
}
