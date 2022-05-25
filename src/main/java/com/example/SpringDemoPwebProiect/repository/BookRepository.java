package com.example.SpringDemoPwebProiect.repository;

import com.example.SpringDemoPwebProiect.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
