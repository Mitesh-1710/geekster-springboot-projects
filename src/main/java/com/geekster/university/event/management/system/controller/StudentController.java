package com.geekster.university.event.management.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.university.event.management.system.constants.ApiPath;
import com.geekster.university.event.management.system.model.Student;
import com.geekster.university.event.management.system.response.StudentResponse;
import com.geekster.university.event.management.system.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(ApiPath.STUDENT_API)
	public String addStudent(@Valid @RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@PutMapping(ApiPath.STUDENT_API_STUDENT_ID_PATH_VARIABLE)
	public String updateDepartmentByStudentId(@PathVariable Integer studentId, @RequestParam String department) {
		return studentService.updateDepartmentByStudentId(studentId, department);

	}

	@DeleteMapping(ApiPath.STUDENT_API_STUDENT_ID_PATH_VARIABLE)
	public String deleteStudentById(@PathVariable Integer studentId) {
		return studentService.deleteStudentById(studentId);
	}

	@GetMapping(ApiPath.GET_ALL_STUDENT_API)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping(ApiPath.STUDENT_API_STUDENT_ID_PATH_VARIABLE)
	public StudentResponse getStudentById(@PathVariable Integer studentId) {
		return studentService.getStudentById(studentId);
	}

}
