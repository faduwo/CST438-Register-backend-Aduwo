package com.cst438.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cst438.domain.Student;
import com.cst438.domain.StudentDTO;
import com.cst438.domain.StudentRepository;



@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/student")

	public Student addStudent(@RequestBody StudentDTO studentDTO) {
		return null;
	}
	public Student getStudentbyId(@RequestBody StudentDTO studentDTO) {
		return null;
	}
	public Student getAllStudents(@RequestBody StudentDTO studentDTO) {
		return null;
	}
	public Student updateStudent(@RequestBody StudentDTO studentDTO) {
		return null;
	}
	public Student deleteStudent(@RequestBody StudentDTO studentDTO) {
		return null;
	}

}

