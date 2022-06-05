package com.example.SpringDemoPwebProiect.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "t_read")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Read {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idr;


    @Column(name = "start_date")
    private String start_date;
    @Column(name = "end_date")
    private String end_date;

    @ManyToOne
    @JoinColumn(name = "id_people")
    private People people;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book book;



}
