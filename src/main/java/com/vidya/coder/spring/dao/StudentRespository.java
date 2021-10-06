package com.vidya.coder.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vidya.coder.spring.model.Student;

@Repository
public interface StudentRespository extends CrudRepository<Student,Integer>{

}
