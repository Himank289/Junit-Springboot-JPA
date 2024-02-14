package collections;
import java.util.*;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//import java.util.function.BiConsumer;



import him.oops.java.Employee;
import him.oops.java.Manager;

//my project often needs a list of emp along with his manager details so I need to have data structure which can keep 
//emp-manager info together and whenever I search for employee i can get his manager details
public class HashMapEmpEx { 



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Ram",5000.0,10);
		Employee e2=new Employee(2,"Raghav",5000.0,10);
		Employee e3=new Employee(3,"sita",5000.0,20);
		Employee e4=new Employee(4,"shiv",5000.0,20);
		Employee e5=new Employee(5,"shubh",5000.0,30);
		
		Manager m = new Manager(11,"Savan",70000,10,5,5000,50000);
		Manager m1= new Manager(9,"Prince",70000,10,5,5000,50000);
		Manager m3 = new Manager(10,"Sita",70000,10,5,5000,50000);
		
		
		//Creating HashMap
		Map<Employee,Manager> mp=new HashMap<Employee,Manager>();
		//Putting values in HashMap
		mp.put(e1, m1);
		mp.put(e2, m);
		mp.put(e3, m1);
		mp.put(e4, m1);
		//Printing hashmap using overriden tostring
		System.out.println(mp);
		
		//used to find size of map
	    System.out.println("size of map:"+mp.size());
		
		Manager mg = mp.get(new Employee(4,"shiv",5000.0,20));
		
		//Checks whether an employee has assigned a manager or not
		if(mg!=null) {
			System.out.println(mg.getEmpName());
		}
		else {
			System.out.println("Employee has not assigned a manager");
		
		}
		//Printing employee manager details
		for(Employee e : mp.keySet()) {
			mg=mp.get(e);
			System.out.println("Manager of employee is "+e.getEmpName()+" "+mg.getEmpName());
		}

		
		Set <Employee> emplst =mp.keySet();
		System.out.println(emplst);
		
		emplst.forEach((Employee ex)->System.out.println(ex));
		
		Collection <Manager> lt=mp.values();
		lt.forEach((Manager ml)->System.out.println(m1));
	
	
	
	}

	
	

}
