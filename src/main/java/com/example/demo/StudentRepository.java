package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
public interface StudentRepository extends MongoRepository<Student, String>{

	List<Student> findByAddressCity(String city);

}
