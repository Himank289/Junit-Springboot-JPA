package vw.him.springboot.springbootdemo2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import vw.him.springboot.springbootdemo2.configuration.EmployeeProperties;
import vw.him.springboot.springbootdemo2.model.Employee;
//@Component,@RestController,@Controller,@Services,@Repository are all beans
@Service //spring container will auto detect and create instance of this if we use @component annotation

public class EmpDao {
	
	
	@Autowired
	EmployeeProperties emp;
	private List<Employee> lst;
	

	
	@Autowired
	public EmpDao(EmployeeProperties emp) {
		lst =new ArrayList<Employee>();
//		lst.add(new Employee(1,"Ishita",50000.0,10));
//		lst.add(new Employee(2,"vishwas",60000.0,10));
		Employee e=new Employee(emp.getId(),emp.getName(),emp.getSalary(),emp.getDeptno());
		lst.add(e);

	}
	public boolean addEmp(Employee e ) {
		return lst.add(e);
	
	}
	
public Employee findEmp(Employee e) {
	Employee ex=lst.stream().filter(emp->emp.getEmpId()==e.getEmpId()).findFirst().orElse(null);
	return ex;
}

public boolean removeEmp(Employee e) {
	return lst.remove(e);
}

public List<Employee> getAllEmps(){
	return this.lst;
}

public Employee findEmp(int id) {
	Employee ex=lst.stream().filter(emp->emp.getEmpId()==id).findFirst()
.orElse(null);
	return ex;}

public Employee findEmp(String empName,int deptno) {
	Employee ex=lst.stream().filter(emp->emp.getDeptno()==deptno&&emp.getEmpName().equals(empName)).findFirst()
			.orElse(null);
				return ex;
}

}
