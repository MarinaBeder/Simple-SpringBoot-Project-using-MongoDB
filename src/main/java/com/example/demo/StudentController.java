package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("student")
public class StudentController {
@Autowired
	private StudentService studentService;
	

	@GetMapping("")
	public List<Student> fetchAllStudents(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("")
	public Student insertNewStudent(@RequestBody Student student){

		 return studentService.insertStudent(student);
	}
	
	@GetMapping("/{city}")
	public List<Student> SearchAboutStudentsByCity ( @PathVariable String city){
		
		
		return studentService.SearchAboutStudentsByCity(city);
	}
}
