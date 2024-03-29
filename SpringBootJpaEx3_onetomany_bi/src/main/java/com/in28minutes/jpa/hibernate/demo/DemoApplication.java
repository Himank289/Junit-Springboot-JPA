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
		
		Faculty f=new Faculty("Himank Tyagi",12,LocalDate.of(2017, 2, 12));
		fr.save(f);
		//course is the owning side of the relatonship so set the faculty here
		Course c=new Course("core java",1800);
		c.setFaculty(f);
		cr.save(c);
		
		Course c1=new Course("springboot",1200);
		c1.setFaculty(f);
		cr.save(c1);
	
	List<Course> lst=Arrays.asList(c,c1);
		
		
		
		//retrieve the faculty with id 3
		f=fr.findById(1);
		if(f!=null) {
			//retrieve all courses by that faculty with id3
			
			List<Course>lst1=fr.getAllCourses(f.getFacultyId());
			System.out.println("courses taught by faculty"+f.getFacultyName()+"are");
			lst1.forEach(System.out::println);
			
		}
		else {
			System.out.println("faculty with faculty id : 1 is not found");
		}
		Faculty f1=cr.findFacultyOfCourse(c1.getCourseId());
		System.out.println("Faculty teaching course "+c1.getCourseName()+"is"+f1.getFacultyName());
		
	}

}
