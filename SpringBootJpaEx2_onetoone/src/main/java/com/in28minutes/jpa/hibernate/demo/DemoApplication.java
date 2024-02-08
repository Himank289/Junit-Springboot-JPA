package com.in28minutes.jpa.hibernate.demo;



import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Faculty;
import com.in28minutes.jpa.hibernate.demo.repository.CourseRepository;
import com.in28minutes.jpa.hibernate.demo.repository.FacultyRepository;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	CourseRepository cr;
	
	@Autowired
	FacultyRepository fr;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
//		Course c=new Course("React ", 13000);
//		cr.save(c);
//		
//	Course c1=cr.findById(1);
//	System.out.println(c1);
//	
//	cr.updateCourseName(c1.getCourseId(), "junit");
//	List<Course> lst=cr.retrieveCourses();
//	System.out.println(lst);
	
	Faculty f=new Faculty("Himank Tyagi",12,LocalDate.of(2017, 2, 12));
		fr.save(f);
		
	Course c=new Course("core java",1800);
		c.setCourseFaculty(f);
		cr.save(c);
		
	c= cr.findById(2);
	System.out.println("course "+c.getCourseName()+" has faculty "+c.getCourseFaculty());
	f=fr.findById(1);
	System.out.println("faculty "+f.getFacultyName()+" has course "+f.getCourse());
	}

}
