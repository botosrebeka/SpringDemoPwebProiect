package com.example.SpringDemoPwebProiect.repository;

import com.example.SpringDemoPwebProiect.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {
}
