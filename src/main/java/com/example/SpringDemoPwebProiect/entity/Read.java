package com.example.SpringDemoPwebProiect.entity;

public class Read {
    private int id;
    private int id_book;
    private int id_people;
    private int reading_date;

    public Read(int id, int id_book, int id_people, int reading_date) {
        this.id = id;
        this.id_book = id_book;
        this.id_people = id_people;
        this.reading_date = reading_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public int getId_people() {
        return id_people;
    }

    public void setId_people(int id_people) {
        this.id_people = id_people;
    }

    public int getReading_date() {
        return reading_date;
    }

    public void setReading_date(int reading_date) {
        this.reading_date = reading_date;
    }
}
