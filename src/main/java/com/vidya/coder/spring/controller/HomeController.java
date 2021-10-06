package com.vidya.coder.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vidya.coder.spring.model.Student;
import com.vidya.coder.spring.serviceimpl.StudentImpl;

@RestController
@CrossOrigin   // Since we are using postman as service we are using Crossorigin
public class HomeController {
	@Autowired
	StudentImpl s;
	@PostMapping(value="savestudent")
	public Student saveStudent(@RequestBody Student student) {
		s.saveStudent(student);
		return student;
	}
	
	@GetMapping(value="findallstudents")
	public List<Student> findAllStudent() {
		return s.findAllStudents();
	}
   
	@PutMapping(value="updatestudent")
	public Student updateStudent(@RequestBody Student student) {
		s.saveStudent(student);
		return student;
	}
	
	@DeleteMapping(value="deletestudent")
	public void deleteStudent(@RequestParam int id) {
		s.deleteStudent(id);
	}
}
