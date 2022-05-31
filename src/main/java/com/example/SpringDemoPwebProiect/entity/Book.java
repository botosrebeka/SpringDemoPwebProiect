package com.example.SpringDemoPwebProiect.entity;

import javax.persistence.*;

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

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public Book(){
    }

    public int getIdb() {
        return idb;
    }

    public void setIdb(int idb) {
        this.idb = idb;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}
