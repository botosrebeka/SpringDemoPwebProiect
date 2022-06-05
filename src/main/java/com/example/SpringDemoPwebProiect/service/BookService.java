package com.example.SpringDemoPwebProiect.service;

import com.example.SpringDemoPwebProiect.dto.BookDto;
import com.example.SpringDemoPwebProiect.entity.Book;
import com.example.SpringDemoPwebProiect.mapper.BookMapper;
import com.example.SpringDemoPwebProiect.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookMapper mapper;

    public List<BookDto> getBookList(){
        return bookRepository.findAll().stream()
                .map(c -> mapper.mapBookDto(c))
                .collect(Collectors.toList());
    }

    public void saveBook(BookDto bookDto){
        Book book = mapper.mapBook(bookDto);
        bookRepository.save(book);
    }

    public void deleteBook(Book book){
        bookRepository.delete(book);
    }

    public BookDto findBookByIdb(int idb){
        Book book = bookRepository.findById(idb).get();
        return mapper.mapBookDto(book);
    }
}
