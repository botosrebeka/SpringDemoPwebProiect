package com.example.SpringDemoPwebProiect.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_people")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idp;

    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "username", unique=true)
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name="age")
    private int age;
    @Column(name = "password")
    private String password;


    @OneToMany(mappedBy = "people",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<Read> readList;

}
