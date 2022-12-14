package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}




	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}




	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}




	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}




	@Override
	public Student updatStuent(Student student) {
		
		return studentRepository.save(student);
	}




	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
