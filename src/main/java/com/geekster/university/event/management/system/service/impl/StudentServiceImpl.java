package com.geekster.university.event.management.system.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.university.event.management.system.constants.UniversityEventManagementSystemConstants;
import com.geekster.university.event.management.system.enums.Department;
import com.geekster.university.event.management.system.model.Student;
import com.geekster.university.event.management.system.repository.StudentRepository;
import com.geekster.university.event.management.system.response.StudentResponse;
import com.geekster.university.event.management.system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public String addStudent(Student student) {
		studentRepository.save(student);
		return UniversityEventManagementSystemConstants.STUDENT_CREATE_RESPONSE;
	}

	@Override
	public String updateDepartmentByStudentId(Integer studentId, String department) {
		Optional<Student> optionalStudent = studentRepository.findById(studentId);
		String response = null;

		if (EnumUtils.isValidEnum(Department.class, department)) {
			if (optionalStudent.isPresent()) {
				Student student = optionalStudent.get();
				student.setDepartment(Department.valueOf(department));
				studentRepository.save(student);
				response = UniversityEventManagementSystemConstants.STUDENT_DEPARTMENT_UPDATE_RESPONSE;
			} else {
				response = UniversityEventManagementSystemConstants.INVALID_STUDENT_ID_RESPONSE;
			}
		} else {
			response = UniversityEventManagementSystemConstants.DEPARTMENT_DOES_NOT_EXISTS_RESPONSE;
		}
		return response;
	}

	@Override
	public String deleteStudentById(Integer studentId) {
		Optional<Student> optionalStudent = studentRepository.findById(studentId);
		String response = null;
		if (optionalStudent.isPresent()) {
			studentRepository.deleteById(studentId);
			response = UniversityEventManagementSystemConstants.STUDENT_DELETE_RESPONSE;
		} else {
			response = UniversityEventManagementSystemConstants.INVALID_STUDENT_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public StudentResponse getStudentById(Integer studentId) {
		Optional<Student> optionalStudent = studentRepository.findById(studentId);
		StudentResponse studentResponse = new StudentResponse();
		if (optionalStudent.isPresent()) {
			studentResponse.setStudent(optionalStudent.get());
			studentResponse.setResponse(UniversityEventManagementSystemConstants.STUDENT_GET_RESPONSE);
		} else {
			studentResponse.setStudent(null);
			studentResponse.setResponse(UniversityEventManagementSystemConstants.INVALID_STUDENT_ID_RESPONSE);
		}
		return studentResponse;
	}

}
