package vw.him.springcontainer.di.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dept {
	
	@Value("10")
	private int deptid;
	
	@Value("account")
	private String demptName;
	
	private int empCt;
	
	@Value("${dept.location}")
	private String location;
	
	public Dept() {
		System.out.println("0 arg constructor Dept called!");
	}
	
	public Dept(int deptid, String demptName, int empCt, String location) {
		super();
		this.deptid = deptid;
		this.demptName = demptName;
		this.empCt = empCt;
		this.location = location;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDemptName() {
		return demptName;
	}
	public void setDemptName(String demptName) {
		this.demptName = demptName;
	}
	public int getEmpCt() {
		return empCt;
	}
	public void setEmpCt(int empCt) {
		this.empCt = empCt;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", demptName=" + demptName + ", empCt=" + empCt + ", location=" + location
				+ "]";
	}
	
	

}
