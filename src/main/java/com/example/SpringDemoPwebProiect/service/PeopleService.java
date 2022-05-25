package com.example.SpringDemoPwebProiect.service;

import com.example.SpringDemoPwebProiect.entity.People;
import com.example.SpringDemoPwebProiect.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    @Autowired
    PeopleRepository peopleRepository;

    public List<People> getPeopleList(){
        return peopleRepository.findAll();
    }

    public void savePeople(People people){
        peopleRepository.save(people);
    }
}
