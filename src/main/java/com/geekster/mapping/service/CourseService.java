package com.geekster.mapping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.mapping.model.Course;
import com.geekster.mapping.model.Student;
import com.geekster.mapping.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private StudentService studentService;

	public Course createCourse(Course course) {
		List<Student> studentList = new ArrayList<>();
		course.getStudentList().stream().forEach(student -> {
			studentList.add( studentService.getStudentById(student.getId().toString()));
		});
		course.setStudentList(studentList);
		return courseRepository.save(course);
	}

	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	public Course getCourseById(String id) {
		Optional<Course> optionalCourse = courseRepository.findById(id);
		Course course = null;
		if (optionalCourse.isPresent()) {
			course = optionalCourse.get();
		}
		return course;
	}

	public Course updateCourse(String id, Course newCourse) {
		Optional<Course> optionalCourse = courseRepository.findById(id);
		Course course = null;
		if (optionalCourse.isPresent()) {
			course = optionalCourse.get();
			course.setTitle(newCourse.getTitle());
			course.setDescription(newCourse.getDescription());
			course.setDuration(newCourse.getDuration());
			course.setStudentList(newCourse.getStudentList());
			courseRepository.save(course);
		}

		return course;
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
