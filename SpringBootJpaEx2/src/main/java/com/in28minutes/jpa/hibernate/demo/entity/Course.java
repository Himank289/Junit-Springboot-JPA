package com.in28minutes.jpa.hibernate.demo.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table is optional iwe dont give it will create table as class name table
@Table(name="courses")
public class Course {

	@Id
//	 @GeneratedValue(strategy=SEQUENCE, generator="CUST_SEQ")
	@GeneratedValue
	
	int courseId;
	
	
	String courseName;
	
	double coursePrice;
	
	@OneToOne
	//@joincolumn is optional if we dont give it it will use default join column name
	@JoinColumn(name="fk_faculty_id") 
	Faculty courseFaculty;
	
	public Course() {
		
	}
	public Course(String courseName, double coursePrice) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	
	


	public Course(double coursePrice, Faculty courseFaculty) {
		super();
		this.coursePrice = coursePrice;
		this.courseFaculty = courseFaculty;
	}
	public Faculty getCourseFaculty() {
		return courseFaculty;
	}
	public void setCourseFaculty(Faculty courseFaculty) {
		this.courseFaculty = courseFaculty;
	}
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice
				+ ", courseFaculty=" + courseFaculty + "]";
	}



	

}
