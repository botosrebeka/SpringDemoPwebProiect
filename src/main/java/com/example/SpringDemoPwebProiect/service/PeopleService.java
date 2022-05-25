package com.example.SpringDemoPwebProiect.service;

import com.example.SpringDemoPwebProiect.entity.People;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleService {

    List<People> peopleList = new ArrayList<>();

    public List<People> getPeopleList(){
        return peopleList;
    }

    public void save(People people){
        peopleList.add(people);
    }
}
