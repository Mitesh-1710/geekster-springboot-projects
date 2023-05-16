package com.geekster.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.mapping.model.Student;
import com.geekster.mapping.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(String id) {
		Optional<Student> optionalStudent = studentRepository.findById(Long.parseLong(id));
		Student student = null;
		if (optionalStudent.isPresent()) {
			student = optionalStudent.get();
		}
		return student;
	}

	public Student updateStudent(String id, Student newStudent) {
		Optional<Student> optionalStudent = studentRepository.findById(Long.parseLong(id));
		Student student = null;
		if (optionalStudent.isPresent()) {
			student = optionalStudent.get();
			student.setName(newStudent.getName());
			student.setAge(newStudent.getAge());
			student.setPhoneNumber(newStudent.getPhoneNumber());
			student.setBranch(newStudent.getBranch());
			student.setDepartment(newStudent.getDepartment());
			student.setAddress(newStudent.getAddress());
			studentRepository.save(student);
		}
		return student;
	}

	public void deleteStudent(String id) {
		studentRepository.deleteById(Long.parseLong(id));
	}
}
