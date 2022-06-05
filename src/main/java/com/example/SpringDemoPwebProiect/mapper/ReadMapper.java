package com.example.SpringDemoPwebProiect.mapper;

import com.example.SpringDemoPwebProiect.dto.ReadDto;
import com.example.SpringDemoPwebProiect.entity.Read;
import org.springframework.stereotype.Component;

@Component
public class ReadMapper {
    public ReadDto mapReadDto(Read read){
        return ReadDto.builder()
                .idr(read.getIdr())
                .start_date(read.getStart_date())
                .end_date(read.getEnd_date())
                .people_firstname(read.getPeople().getFirstname())
                .people_lastname(read.getPeople().getLastname())
                .book_title(read.getBook().getTitle())
                .book_author(read.getBook().getAuthor())
                .build();
    }
    public Read mapRead(ReadDto readDto){
        return Read.builder()
                .idr(readDto.getIdr())
                .start_date(readDto.getStart_date())
                .end_date(readDto.getEnd_date())
                .build();
    }
}
