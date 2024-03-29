package vw.him.springcontainer.di;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import vw.him.springcontainer.di.model.*;
import vw.him.springcontainer.di.model.*;

@ComponentScan(basePackages = { "restcontroller","vw.him.springcontainer.di"})
@SpringBootApplication
public class Springbootdemo2Application { //implements CommandLineRunner {

//	@Autowired
//	Emp e1;
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(Springbootdemo2Application.class, args);
		
		Emp emp = (Emp)ctx.getBean("emp1");
		System.out.println(emp.getEmpId());
		System.out.println(emp.computeAnnualSalary());
		
		Dept d = emp.getDept();
		System.out.println(d.getDeptid());
		System.out.println(ctx.containsBean("dept"));
		System.out.println(ctx.containsBean("emp1"));
		System.out.println(ctx.containsBean("emp"));
		
		Dept dep = (Dept) ctx.getBean("dept");
		System.out.println(dep.getDeptid());
		System.out.println(dep.getLocation());
		
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Compute Annual Salary: "+e1.computeAnnualSalary());
//	}

}
