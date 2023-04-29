package com.geekster.university.event.management.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geekster.university.event.management.system.model.Student;
import com.geekster.university.event.management.system.response.StudentResponse;

@Service
public interface StudentService {

	public String addStudent(Student student);

	public String updateDepartmentByStudentId(Integer studentId, String department);

	public String deleteStudentById(Integer studentId);

	public List<Student> getAllStudents();

	public StudentResponse getStudentById(Integer studentId);

}
