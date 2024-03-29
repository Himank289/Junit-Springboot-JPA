package com.in28minutes.jpa.hibernate.demo.restcontrollers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.jpa.hibernate.demo.Dao.CourseDao;
import com.in28minutes.jpa.hibernate.demo.entity.Course;

@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired 
	private CourseDao coursedao;
	
	@GetMapping("/course")
	public List<Course> getAllCourse(){
		return coursedao.getAllCourses();
		}
	
	
	@GetMapping("/{id}")
	public Course findCourseById(@PathVariable int id) {
		
		return coursedao.getCourseById(id);
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course c) {
		return coursedao.saveCourse(c);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable int id) {
		coursedao.deleteCourse(id);
	}
	
	
	

}
