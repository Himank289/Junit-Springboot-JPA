package com.in28minutes.jpa.hibernate.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Faculty;



@Component
@Transactional
public class CourseRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;
	
	public void save(Course c) {
		if(c.getCourseId()==0) {
			em.persist(c);
			logger.info("course with course id"+c.getCourseId()+"persisted");
		}
		else {
			this.em.merge(c);
			logger.info("course with course id"+c.getCourseId()+"merged");
		}


		
	}
	
	public Course findById(int id) {
	Course c=	this.em.find(Course.class, id);

	logger.info("course with course id"+c.getCourseId()+"retrieved");
//	c.setCourseName("java");
//	c.setCoursePrice(1000);
	//first level cache in hibernate persistence context managed by enitity manager used so that there will be less number of sql qureies.tracking is bounded by transactional boundaries
	//detach state -no tracking oustie transaction boundaries.
	//managed instances
//	c.setCourseName("angular");
		return c;
	}
	
public void updateCourseName(int id,String name) {
	Course c=	this.em.find(Course.class, id);
	logger.info("course"+c);
	c.setCourseName(name);
	logger.info("after updating the course name"+c.getCourseName());
	
}

public List<Course> retrieveCourses() {

	  /*
	  TypedQuery<Employee> typ = em.createQuery("select e from Employee e",Employee.class);
	  
	  List<Employee> e = typ.getResultList(); 
   */
	    //select * frm dbanme.courses -sql query
//	jpql-orm query java persistence query langauate object based syntax
	  List<Course> lst = em.createQuery("select c from Course c",Course.class).getResultList(); 
	  logger.info("list of all existing courses"+lst);

//print it once to lazy fetch the departments and passport of each emp in list

return lst;
}

public List<Faculty> findFacultyOfCourse(int courseid) {
	Course c=this.findById(courseid);
	List<Faculty> f=c.getFaculty();
	if(f!=null) {
		logger.info("Faculty teaching ourse"+c.getCourseName()+"is"+f);
	}
	else {
		logger.info("Faculty teaching ourse"+c.getCourseName()+"is"+f+"is null");
	}
	
	
	return f;
	
}

}
