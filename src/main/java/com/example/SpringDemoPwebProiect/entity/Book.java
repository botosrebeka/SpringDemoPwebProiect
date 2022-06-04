package com.example.SpringDemoPwebProiect.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "t_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idb;

    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "release_date")
    private String release_date;
    @Column(name = "gener")
    private String gener;
    @Column(name = "page_number")
    private int page_number;
    @Column(name = "series")
    private String series;

    public Book(int idb, String title, String author, String isbn, String release_date, String gener, int page_number, String series) {
        this.idb = idb;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.release_date = release_date;
        this.gener = gener;
        this.page_number = page_number;
        this.series = series;
    }
    public Book(){
    }

}
