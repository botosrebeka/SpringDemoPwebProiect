package com.example.SpringDemoPwebProiect.service;

import com.example.SpringDemoPwebProiect.dto.PeopleDto;
import com.example.SpringDemoPwebProiect.entity.People;
import com.example.SpringDemoPwebProiect.mapper.PeopleMapper;
import com.example.SpringDemoPwebProiect.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeopleService {

    @Autowired
    PeopleRepository peopleRepository;

    @Autowired
    PeopleMapper mapper;

    public List<PeopleDto> getPeopleList(){
        return peopleRepository.findAll().stream()
                .map(c -> mapper.mapPeopleDto(c))
                .collect(Collectors.toList());
    }

    public void savePeople(PeopleDto peopleDto){
        People people = mapper.mapPeople(peopleDto);
        peopleRepository.save(people);
    }

    public void deletePeople(People people){
        peopleRepository.delete(people);
    }

    public PeopleDto findPeopleByIdp(int idp){
        People people = peopleRepository.findById(idp).get();
        return mapper.mapPeopleDto(people);
    }

    public boolean login(){
        return true;
    }
}
