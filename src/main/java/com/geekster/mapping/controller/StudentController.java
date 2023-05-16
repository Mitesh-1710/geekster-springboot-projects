package com.geekster.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.mapping.model.Student;
import com.geekster.mapping.service.StudentService;

@RestController
@RequestMapping("api/v1/mapping")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable String id) {
		return studentService.getStudentById(id);
	}

	@PutMapping("/student/{id}")
	public void updateStudent(@PathVariable String id, @RequestBody Student student) {

		studentService.updateStudent(id, student);
	}

	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
}
