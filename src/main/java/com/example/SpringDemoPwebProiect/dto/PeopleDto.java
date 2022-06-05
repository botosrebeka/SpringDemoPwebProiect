package com.example.SpringDemoPwebProiect.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PeopleDto {
    private int idp;
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private int age;
    private String password;
}
