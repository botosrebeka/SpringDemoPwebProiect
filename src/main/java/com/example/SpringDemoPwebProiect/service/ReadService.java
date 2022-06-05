package com.example.SpringDemoPwebProiect.service;

import com.example.SpringDemoPwebProiect.dto.ReadDto;
import com.example.SpringDemoPwebProiect.entity.Book;
import com.example.SpringDemoPwebProiect.entity.Read;
import com.example.SpringDemoPwebProiect.mapper.ReadMapper;
import com.example.SpringDemoPwebProiect.repository.ReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReadService {

    @Autowired
    ReadRepository readRepository;

    @Autowired
    ReadMapper mapper;

    public List<ReadDto> getReadList(){
        return readRepository.findAll().stream()
                .map(r -> mapper.mapReadDto(r))
                .collect(Collectors.toList());
    }

    public void saveRead(ReadDto readDto){
        Read read = mapper.mapRead(readDto);
        readRepository.save(read);
    }

    public void deleteRead(Read read){readRepository.delete(read);}

    public ReadDto findReadById(int idr){
        Read read = readRepository.findById(idr).get();
        return mapper.mapReadDto(read);
    }
}
