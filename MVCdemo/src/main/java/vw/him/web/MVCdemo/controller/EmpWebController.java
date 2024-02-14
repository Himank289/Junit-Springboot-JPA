package vw.him.web.MVCdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.classic.Logger;
import vw.him.web.MVCdemo.dao.EmpDao;
import vw.him.web.MVCdemo.exception.EmployeeNotFoundException;
import vw.him.web.MVCdemo.model.*;

@RequestMapping("empwebcontrol")
@Controller
public class EmpWebController {
	
	@Autowired
	EmpDao ed;
	
	@GetMapping("/empform")
	public String getEmpForm(Model model) {
		Employee e=new Employee();
		model.addAttribute("employee",e);
		return "empform";
	}
	
	@RequestMapping(value="/emp/{empid}",method=RequestMethod.GET)
	public String getAllEmp(@PathVariable int empid, ModelMap map) {
		try {
			Employee e = this.ed.getEmpById(empid);
			map.addAttribute("empid",empid);
			map.addAttribute("emp",e);
		} catch(EmployeeNotFoundException e) {
			map.addAttribute("empexception",e.getMessage());
		}
		return "dispemp";
	}
	
	
	@RequestMapping(value="/emp/sal/{empid}",method=RequestMethod.GET)
	public String fetchAnnualSal(@PathVariable int empid, ModelMap map) {
		try {
			Employee e = this.ed.getEmpById(empid);
			double annsal = e.computeAnnualSalary();
			map.addAttribute("empid",empid);
			map.addAttribute("empannsal",annsal);
		} catch(EmployeeNotFoundException e) {
			map.addAttribute("empexception",e.getMessage()+" so annual salary can not be computed");
		}
		return "empannsal";
	}
	
//	@PostMapping("/empp")
//	public String addEmployee( @ModelAttribute("employee") Employee e,ModelMap map) {
//		Employee em=ed.addEmp(e) ;
//		map.addAttribute("postedemp", em);
//		return "postempdet";
//		
//	}
	
	
	@PostMapping("/empp")
	public String addEmployee( @ModelAttribute("employee") @Valid Employee e,BindingResult bindingResult,ModelMap map)
	{
		if (bindingResult.hasErrors()) {
//			logger.info("employee validation failed:Returning back to empform.jsp page");
			return "empform";
		}
		else
		{
//		logger.info("postemp:"+e);
	    Employee em = this.ed.addEmp(e);
	    map.addAttribute("postedemp", em);
	    return "postempdet";
		}
	}
	
	
	
	

}
