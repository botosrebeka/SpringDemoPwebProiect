package com.example.SpringDemoPwebProiect.entity;

import javax.persistence.*;

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
    @Column(name="age")
    private int age;

    public People(int idp, String firstname, String lastname, int age) {
        this.idp = idp;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public People(){};
    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
