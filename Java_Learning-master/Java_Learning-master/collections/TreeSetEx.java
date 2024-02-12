package collections;

import java.util.*;

import him.oops.java.Employee;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> st=new TreeSet<String>();
		st.add("Himank");
		st.add("Tyagi");
		st.add("AHI");
		
		System.out.println(st);

		Set <Employee> s=new TreeSet<Employee>(); //using default compareableinterface
		//Sorted set of Employees using compareto while adding (by default in this case based on employeee id)
		
		Employee e1 = new Employee(1,"Ram",50000.0,10);
		Employee e2 = new Employee(4,"Rahim",80000.0,10);
	    Employee e3 = new Employee(2,"Nina",40000.0,20);
	    Employee e4 = new Employee(7,"Tina",70000.0,20);
	    Employee e5 = new Employee(5,"Umesh",60000.0,30);
		
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		
		
		System.out.println(s);
		
//		
//		Employee e1 = new Employee(1,"Ram",50000.0,10);
//		Employee e2 = new Employee(4,"Rahim",80000.0,10);
//	    Employee e3 = new Employee(2,"Nina",40000.0,20);
//	    Employee e4 = new Employee(7,"Tina",70000.0,20);
//	    Employee e5 = new Employee(5,"Umesh",60000.0,30);
		
		
		//using comparator interface by passing object of onemoreway class and comparing on different factors like based on salary,name etc.
		
		  /*
				Comparator<Employee> cmp = new OneMoreWayCompare();
				Set<Employee> st2 = new TreeSet<Employee>(cmp);
				*/
		
		//when to use Comparator interface - when you have to sort on different basis than what is being used in Comparable interface
				//pass Comparator instance to TreeSet constructor so as it will sort on basis of Comparator thats added
		
		Set<Employee> st2=new TreeSet<Employee>(new OneMoreWayCompare());
		st2.add(e1);
		st2.add(e2);
		st2.add(e3);
		st2.add(e4);
		
		System.out.println(st2);
		
		
	}

}
