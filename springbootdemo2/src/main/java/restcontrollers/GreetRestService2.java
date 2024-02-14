package restcontrollers;

import java.util.List;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vw.him.springboot.springbootdemo2.dao.EmpDao;
import vw.him.springboot.springbootdemo2.model.Employee;

// @Controller+@ResponseBody
@RestController
public class GreetRestService2 {
	//dependency of greetrestservice2
	//dependency injection -basic feature of Spring Framework it will inject the dependency
	@Autowired 
	EmpDao empdao;
	private static Logger LOGGER=LoggerFactory.getLogger(GreetRestService2.class);
@GetMapping("hello")
public String Hello() {
//	LOGGER.info("Hello called()"); it is only used for testing
	LOGGER.debug("debug level");
	return "Hi this is my first springboot rest api";
	
}


@GetMapping("emp/{empId}")
public Employee getEmpUsingPathVariable(@PathVariable int empId) {
	LOGGER.debug("GET EMP using path variable CALLED");
	Employee x=empdao.findEmp(empId);
	LOGGER.debug("emp found"+x);
	return x;
}

@GetMapping("emps")
public List<Employee> getAllEmp() {
	LOGGER.debug("GET ALLemps called");
	return empdao.getAllEmps();
}

@PostMapping("emp")
public boolean postEmp(@RequestBody Employee e) {
		return this.empdao.addEmp(e);
		
		
	}
@GetMapping("emp")
public Employee getEmpUsingRequestParam(@RequestParam(name="empId") int empId) {
	LOGGER.debug("GET EMP using request paramCALLED");
	Employee x=empdao.findEmp(empId);
	LOGGER.debug("emp found"+x);
	return x;
}

@GetMapping("empbyname")
public Employee getEmpUsingRequestParam(@RequestParam(name="empname") String empname,@RequestParam(name="deptno")int deptno) {
	LOGGER.debug("GET EMP using request param CALLED");
	Employee x=empdao.findEmp(empname, deptno);
	return x;
}

@GetMapping("emp/{empname}/{deptno}")
public Employee getEmpUsingPathVariable(@PathVariable String empname,@PathVariable int deptno) {
	LOGGER.debug("GET EMP using path variable CALLED");
	Employee x=empdao.findEmp(empname,deptno);
	LOGGER.debug("emp found"+x);
	return x;
}




}
