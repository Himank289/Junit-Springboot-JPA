package com.in28minutes.jpa.hibernate.demo;



import java.time.LocalDate;
import java.util.Arrays;
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
		
		
		Course c=new Course("core java",1800);
		cr.save(c);
		
		Course c1=new Course("springboot",1200);
		cr.save(c1);
	
	List<Course> lst=Arrays.asList(c,c1);
		
		Faculty f=new Faculty("Himank Tyagi",12,LocalDate.of(2017, 2, 12),lst);
		fr.save(f);
		
		//retrieve the faculty with id 3
		f=fr.findById(3);
		//retrieve all courses by that faculty with id3
	List<Course>lst1=fr.getAllCourses(f.getFacultyId());
		System.out.println("courses taught by faculty"+f.getFacultyName()+"are");
		lst1.forEach(System.out::println);
	}

}
