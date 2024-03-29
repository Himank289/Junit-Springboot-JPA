package com.in28minutes.jpa.hibernate.demo.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Faculty {
	@Id
	@GeneratedValue
	int facultyId;
	

	String facultyName;
	
	int totalExp;
	
	LocalDate joinDate;
	
	@ManyToMany
	List<Course> courses;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	



	public Faculty(String facultyName, int totalExp, LocalDate joinDate, List<Course> courses) {
		super();
		this.facultyName = facultyName;
		this.totalExp = totalExp;
		this.joinDate = joinDate;
		this.courses = courses;
	}







	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public int getTotalExp() {
		return totalExp;
	}

	public void setTotalExp(int totalExp) {
		this.totalExp = totalExp;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	


	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		return facultyId == other.facultyId;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", totalExp=" + totalExp
				+ ", joinDate=" + joinDate + ", courses=" + courses + "]";
	}

	
	
	
}
