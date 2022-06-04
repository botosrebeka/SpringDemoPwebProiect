package com.example.SpringDemoPwebProiect.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "t_people")
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

    public People(int idp, String firstname, String lastname, String username, String email, int age, String password) {
        this.idp = idp;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.age = age;
        this.password = password;
    }
    public People(){};

}
