package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
private StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	public Student insertStudent(Student student) {
		studentRepository.save(student);	
	return student;
		
	}
	

	public List<Student> SearchAboutStudentsByCity(String city) {
		List<Student> Students=	studentRepository.findByAddressCity(city);

		return Students;
	}
	
	

}
