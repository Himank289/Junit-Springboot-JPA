package com.in28minutes.jpa.hibernate.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Faculty;


//@Transactional
@Repository
public interface FacultySpringDataJpaRepository extends JpaRepository<Faculty,Integer>{
//try to call count,deleteById,delete,findById
	
	

}

