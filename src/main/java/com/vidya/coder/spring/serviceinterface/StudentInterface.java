package com.vidya.coder.spring.serviceinterface;

import java.util.List;

import com.vidya.coder.spring.model.Student;

public interface StudentInterface {
	public Student saveStudent(Student student);

	public Student updateStudent(Student student);

	public List<Student> findAllStudents();

	public void deleteStudent(int id);
}
