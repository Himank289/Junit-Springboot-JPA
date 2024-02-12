package him.basic.java;

import him.oops.java.Employee;

public class PartTimeEmployee extends Employee {
	
	int partTimeDuration;

	public PartTimeEmployee() {
		
		this.proj = "aaa";  //protected is visible in another package to a derived class/subclass
		
		
	}
	
	public static void main(String[] args)
	{
		PartTimeEmployee ob = new PartTimeEmployee();
		ob.proj = "AAA";
	}
	
	
	static void func()
	{
		PartTimeEmployee ob = new PartTimeEmployee();
		ob.proj = "AAA";
	}
	

}
