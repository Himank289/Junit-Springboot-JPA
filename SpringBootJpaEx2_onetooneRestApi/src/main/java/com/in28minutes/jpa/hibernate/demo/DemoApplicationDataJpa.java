package com.in28minutes.jpa.hibernate.demo;



import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Faculty;
//import com.in28minutes.jpa.hibernate.demo.entity.Employee1;
import com.in28minutes.jpa.hibernate.demo.repository.CourseSpringDataJpaRepository;
import com.in28minutes.jpa.hibernate.demo.repository.FacultySpringDataJpaRepository;



@SpringBootApplication
public class DemoApplicationDataJpa implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationDataJpa.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		
		

		}
		

		
}
