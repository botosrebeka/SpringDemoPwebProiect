package com.example.SpringDemoPwebProiect.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
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

}
