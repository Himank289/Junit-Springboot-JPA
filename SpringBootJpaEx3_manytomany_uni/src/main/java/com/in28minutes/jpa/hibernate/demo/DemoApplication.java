package com.in28minutes.jpa.hibernate.demo;



import java.time.LocalDate;
import java.util.ArrayList;
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
		
		Course c2=new Course("OOPS",2400);
		cr.save(c2);
		
			//course is the owning side of the relatonship so set the faculty here
	
		List<Course>l1=new ArrayList<Course>();
		l1.add(c);
		l1.add(c1);
		
		List<Course>l2=new ArrayList<Course>();
		l2.add(c2);
		
		Faculty f=new Faculty("Himank Tyagi",12,LocalDate.of(2017, 2, 12),l1);
		fr.save(f);
		
		Faculty f1=new Faculty("shiv sharma",9,LocalDate.now(),l2);
		fr.save(f1);
		
		
		
		f=fr.findById(4);
		List<Course> lst1=fr.getAllCoursesOfFaculty(f.getFacultyId());
		System.out.println("courses teached by faculty"+f.getFacultyName()+"are");
	lst1.forEach(System.out::println);
	}

}
