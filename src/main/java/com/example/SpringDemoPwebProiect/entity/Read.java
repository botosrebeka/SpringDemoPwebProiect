package com.example.SpringDemoPwebProiect.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_read")
public class Read {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idr;

    @Column(name = "id_book")
    private int id_book;
    @Column(name = "id_people")
    private int id_people;
    @Column(name = "start_date")
    private String start_date;
    @Column(name = "end_date")
    private String end_date;

    public Read(int idr, int id_book, int id_people, String start_date, String end_date) {
        this.idr = idr;
        this.id_book = id_book;
        this.id_people = id_people;
        this.start_date = start_date;
        this.end_date = end_date;
    }


    public Read(){}

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
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

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
