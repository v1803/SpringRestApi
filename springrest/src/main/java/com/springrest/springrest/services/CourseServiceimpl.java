package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.course;

@Service
public class CourseServiceimpl implements CourseService {

	List<course> list;
	
	public CourseServiceimpl() {
		list=new ArrayList<>();
		list.add(new course(145,"Java core Course","this course contains basics of java"));
		list.add(new course(4343,"spring boot Course","creating rest api using spring boot"));
	}
	@Override
	public List<course> getCourse() {
		return list;
	}
	@Override
	public course getCourse(long courseId) {
		
		course c=null;
		for(course course:list) 
		{
			if(course.getId()==courseId) 
			{
				c=course;
				break;
			}
			
		}
		return c;
	}
	@Override
	public course addCourse(course course) {
		list.add(course);
		return null;
	}

}
