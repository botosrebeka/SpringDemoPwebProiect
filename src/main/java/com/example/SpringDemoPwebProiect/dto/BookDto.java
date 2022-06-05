package com.example.SpringDemoPwebProiect.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {

    private int idb;
    private String title;
    private String author;
    private String isbn;
    private String release_date;
    private String gener;
    private int page_number;
    private String series;

}
