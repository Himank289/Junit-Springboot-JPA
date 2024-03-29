package vw.him.springboot.springbootdemo2.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
//@Profile("dev")
//@Profile("prod")
@ConfigurationProperties("employee")
public class EmployeeProperties {
private int id;
private String name;
private double salary;
private int deptno;


public EmployeeProperties() {
	
}


public EmployeeProperties(int id, String name, double salary, int deptno) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.deptno = deptno;
}





public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}


public int getDeptno() {
	return deptno;
}


public void setDeptno(int deptno) {
	this.deptno = deptno;
}


@Override
public String toString() {
	return "EmployeeProperties [id=" + id + ", name=" + name + ", salary=" + salary + ", deptno=" + deptno + "]";
}



}
