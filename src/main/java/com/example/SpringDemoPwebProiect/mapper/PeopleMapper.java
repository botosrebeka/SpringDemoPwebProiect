package com.example.SpringDemoPwebProiect.mapper;

import com.example.SpringDemoPwebProiect.dto.PeopleDto;
import com.example.SpringDemoPwebProiect.entity.People;
import org.springframework.stereotype.Component;

@Component
public class PeopleMapper {
    public PeopleDto mapPeopleDto(People people){
        return PeopleDto.builder()
                .idp(people.getIdp())
                .firstname(people.getFirstname())
                .lastname(people.getLastname())
                .username(people.getUsername())
                .email(people.getEmail())
                .age(people.getAge())
                .password(people.getPassword())
                .build();
    }
    public People mapPeople(PeopleDto peopleDto){
        return People.builder()
                .idp(peopleDto.getIdp())
                .firstname(peopleDto.getFirstname())
                .lastname(peopleDto.getLastname())
                .username(peopleDto.getUsername())
                .email(peopleDto.getEmail())
                .age(peopleDto.getAge())
                .password(peopleDto.getPassword())
                .build();

    }
}
