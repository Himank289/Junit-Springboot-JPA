package com.in28minutes.jpa.hibernate.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.repository.CourseSpringDataJpaRepository;

@Service
public class CourseDao {
@Autowired 
private CourseSpringDataJpaRepository courserepo;



//Course c=new Course("java",1200.90);
public Course saveCourse(Course c) {
	return courserepo.save(c);
}

public List<Course> getAllCourses(){
	return courserepo.findAll();
}

public Course getCourseById(int id) {
	return courserepo.findByCourseId(id);
}


public void deleteCourse(int CourseId) {
	courserepo.deleteByCourseId(CourseId);
}
	
}
