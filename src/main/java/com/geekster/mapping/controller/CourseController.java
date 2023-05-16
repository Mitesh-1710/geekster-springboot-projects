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

import com.geekster.mapping.model.Course;
import com.geekster.mapping.service.CourseService;

@RestController
@RequestMapping("api/v1/mapping")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping("/course")
	public Course createCourse(@RequestBody Course course) {
		return courseService.createCourse(course);
	}

	@GetMapping("/courses")
	public List<Course> getAllCourses() {

		return courseService.getAllCourses();
	}

	@GetMapping("/course/{id}")
	public Course getCourseById(@PathVariable String id) {

		return courseService.getCourseById(id);
	}

	@PutMapping("/course/{id}")
	public void updateCourse(@PathVariable String id, @RequestBody Course course) {

		courseService.updateCourse(id, course);
	}

	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
