package com.vidya.coder.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidya.coder.spring.dao.StudentRespository;
import com.vidya.coder.spring.model.Student;
import com.vidya.coder.spring.serviceinterface.StudentInterface;

@Service
public class StudentImpl implements StudentInterface {
    
	@Autowired
	private StudentRespository studentrep;
	@Override
	public Student saveStudent(Student student) {
		return studentrep.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentrep.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		return (List<Student>) studentrep.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		studentrep.deleteById(id);
	}
}
