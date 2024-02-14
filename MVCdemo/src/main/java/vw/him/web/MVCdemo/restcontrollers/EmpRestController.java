package vw.him.web.MVCdemo.restcontrollers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import vw.him.web.MVCdemo.dao.EmpDao;
import vw.him.web.MVCdemo.exception.EmployeeNotFoundException;
import vw.him.web.MVCdemo.model.Employee;

@RequestMapping("/emprest")
@RestController
public class EmpRestController {
	
	@Autowired
	EmpDao ed;
	
	
	@GetMapping("/emp/{eId}")
	public Employee getEmpByid(@PathVariable int eId) {
		return this.ed.getEmpById(eId);
	}
	
	@GetMapping("/emps")
	public List<Employee> getAllEmp(){
		return this.ed.getAllEmp();
	}
	
	@PostMapping("/addemp")
	public Employee addEmp(@Valid @RequestBody Employee employee) {
		return this.ed.addEmp(employee);
	}
	
	

}
