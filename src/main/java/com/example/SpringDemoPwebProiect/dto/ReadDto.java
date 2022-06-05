package com.example.SpringDemoPwebProiect.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReadDto {
    private int idr;
    private String start_date;
    private String end_date;
    private String people_firstname;
    private String people_lastname;
    private String book_title;
    private String book_author;
}
