package vw.him.springboot.springbootdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//@SpringConfiguration,@EnableAutoconfiguration,@ComponentScan
import org.springframework.context.annotation.ComponentScan;

import vw.him.springboot.springbootdemo2.configuration.EmployeeProperties;
//overiding component scan
@ComponentScan(basePackages= {"restcontrollers"," vw.him.springboot.springbootdemo2"})
///@SpringConfiguration,@EnableAutoConfiguration,@ComponentScan spring framework
@SpringBootApplication
@EnableConfigurationProperties(EmployeeProperties.class)
public class Springbootdemo2Application implements CommandLineRunner {

	@Autowired
	EmployeeProperties emp;
	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("my name is "+emp.getName());
		System.out.println("my id is "+emp.getId());
		System.out.println("my salary is "+emp.getSalary());
		System.out.println("my department is "+emp.getDeptno());

		
	}

}
//spring framework
//spring boot project