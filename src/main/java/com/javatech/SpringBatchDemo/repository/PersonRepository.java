package com.javatech.SpringBatchDemo.repository;

import com.javatech.SpringBatchDemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<com.javatech.SpringBatchDemo.entity.Person, Long> {
}
