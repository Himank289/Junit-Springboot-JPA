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
public class FacultyRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;
	
	public void save(Faculty f) {
		if(f.getFacultyId()==0) {
			em.persist(f);
			logger.info("faculty with faculty id"+f.getFacultyId()+"persisted");
		}
		else {
			this.em.merge(f);
			logger.info("course with course id"+f.getFacultyId()+"merged");
		}


		
	}
	
	public Faculty findById(int id) {
		Faculty f=	this.em.find(Faculty.class, id);

	logger.info("faculty with faculty id"+f.getFacultyId()+"retrieved");
//	c.setCourseName("java");
//	c.setCoursePrice(1000);
	//first level cache in hibernate persistence context managed by enitity manager used so that there will be less number of sql qureies.tracking is bounded by transactional boundaries
	//detach state -no tracking oustie transaction boundaries.
	//managed instances
//	c.setCourseName("angular");
		return f;
	}
	
public void updateTotExp(int id,int totexp) {
	Faculty f=	this.em.find(Faculty.class, id);
//	logger.info("course"+c);

	f.setTotalExp(totexp);
	logger.info("after updating the total exp of faculty"+f.getTotalExp());
	
}

public List<Faculty> getAllFaculties() {

	  /*
	  TypedQuery<Employee> typ = em.createQuery("select e from Employee e",Employee.class);
	  
	  List<Employee> e = typ.getResultList(); 
   */
	    //select * frm dbanme.courses -sql query
//	jpql-orm query java persistence query langauate object based syntax
	  List<Faculty> lst = em.createQuery("select f from Faculty f",Faculty.class).getResultList(); 
	  logger.info("list of all existing courses"+lst);

//print it once to lazy fetch the departments and passport of each emp in list

return lst;
}

}
