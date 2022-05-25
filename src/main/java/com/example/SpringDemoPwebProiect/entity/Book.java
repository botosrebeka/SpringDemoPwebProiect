package com.example.SpringDemoPwebProiect.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_book")
public class Book {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "isbn")
    private int isbn;
    @Column(name = "release_date")
    private String release_date;

    public Book(int id, String title, String author, int isbn, String release_date) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.release_date = release_date;
    }

    public Book(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
