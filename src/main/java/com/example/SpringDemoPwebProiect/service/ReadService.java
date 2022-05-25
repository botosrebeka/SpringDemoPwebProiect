package com.example.SpringDemoPwebProiect.service;

import com.example.SpringDemoPwebProiect.entity.Book;
import com.example.SpringDemoPwebProiect.entity.Read;
import com.example.SpringDemoPwebProiect.repository.ReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadService {

    @Autowired
    ReadRepository readRepository;

    public List<Read> getReadList(){return readRepository.findAll();}

    public void saveRead(Read read){readRepository.save(read);}

    public void deleteRead(Read read){readRepository.delete(read);}

    public Read findReadById(int id){return readRepository.findById(id).get();}
}
