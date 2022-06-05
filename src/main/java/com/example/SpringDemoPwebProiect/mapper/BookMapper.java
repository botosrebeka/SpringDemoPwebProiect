package com.example.SpringDemoPwebProiect.mapper;

import com.example.SpringDemoPwebProiect.dto.BookDto;
import com.example.SpringDemoPwebProiect.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookDto mapBookDto(Book book){
        return BookDto.builder()
                .idb(book.getIdb())
                .title(book.getTitle())
                .author(book.getAuthor())
                .isbn(book.getIsbn())
                .release_date(book.getRelease_date())
                .gener(book.getGener())
                .page_number(book.getPage_number())
                .series(book.getSeries())
                .build();
    }

    public Book mapBook(BookDto bookDto){
        return Book.builder()
                .idb(bookDto.getIdb())
                .title(bookDto.getTitle())
                .author(bookDto.getAuthor())
                .isbn(bookDto.getIsbn())
                .release_date(bookDto.getRelease_date())
                .gener(bookDto.getGener())
                .page_number(bookDto.getPage_number())
                .series(bookDto.getSeries())
                .build();
    }
}
