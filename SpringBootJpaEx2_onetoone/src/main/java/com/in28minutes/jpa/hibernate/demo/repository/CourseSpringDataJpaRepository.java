package com.in28minutes.jpa.hibernate.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.hibernate.demo.entity.Course;


//@Transactional
@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Integer>{
//try to call count,deleteById,delete,findById
	
	List<Course> findByCourseNameAndCourseId(String courseName, Integer courseId);

	List<Course> findByCourseName(String courseName);
	
	List<Course> findByCourseNameOrderByCourseIdDesc(String courseName);

	@Transactional
	List<Course> deleteByCourseName(String courseName);

	Long countByCourseName(String courseName);
	
	@Query("Select  c From Course c where courseName like '%Java%'")
	List<Course> courseWithPatternInCourseName();

	@Query(value = "Select  *  From Course c where cousreName like '%Java%'", nativeQuery = true)
	List<Course> courseWithPatternInCourseNameUsingNativeQuery();
	

}

