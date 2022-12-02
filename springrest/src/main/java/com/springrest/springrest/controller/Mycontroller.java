package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.course;
import com.springrest.springrest.services.CourseService;

@RestController
public class Mycontroller {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		
		
		return "Welcome to courses applicaion";
	}
	// Get the courses (API)
	
	@GetMapping ("/Courses")
	public List<course> getCourses()
	{
		
		return this.courseService.getCourse();
	}
	
	@GetMapping("/course/{courseId")
	public course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public course addcourse(@RequestBody course course) {
		
		return this.courseService.addCourse(course);
	}
	
}
