package streams;


import java.util.*;
import java.util.stream.*;

import him.oops.java.Employee;

public class SreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<Integer>();
	 	System.out.println(lst.isEmpty());
		lst.add(20); 
		lst.add(20);
		lst.add(10);
		lst.add(60);
		lst.add(80);
		lst.add(4);
		
		Stream<Integer> str=lst.stream();// creating a stream of inegers rom collection
		System.out.println(str.count()); //count total elements in the stream and it is a terminal operation 
		//we can identify a operation as terminal or intermediate by checking its return type if return type is void then it is a terminal operation and will close stream while if 
		//function is returning something then it is a intermediate operation and will not close stream
		//as str stream is closed you cannot use it, it will throw exception if u use it like 
		//Illegal state exception :stream has already been operated upon or closed
		
		
		int total=lst.stream().reduce(0, (a,b)->a+b);  //again open stream and find single resultant aggregate value for all elements in collection (terminal operation)
		System.out.println(total);
		
		System.out.println("sort all elements in lst collection in ascending order and display it:");
		lst.stream().sorted().forEach((Integer i)->System.out.println(i));
		
		
		System.out.println("list all elements in ascending order eliminating duplicates..:");
		lst.stream().distinct().sorted().forEach((Integer i)->System.out.println(i));
		
		System.out.println("sort all elements in lst collection in descending order and display it:");
		lst.stream().sorted((Integer a,Integer b)->b-a).forEach((Integer i)->System.out.println(i));		
		
		System.out.println("sort all elements in lst collection in descending order and display it:"); // is is not working properly as conervting into set willprint in unoredered way
		//but we have soretd in descending order
		Set <Integer> s=lst.stream().sorted((Integer a,Integer b)->b-a).collect(Collectors.toSet());
		//solution of above problem
		SortedSet <String> empnames=new TreeSet<String>(empnames); //passing empnames(set collection) to treeset so that it will get sorted , string <thing in angular bracket willimplement compaable> will implement comparable(compare to method)
		
		
		System.out.println("Create a List of Employees and display it:");
		List<Employee> lst1 = new ArrayList<Employee>();
	 	
		Employee e1 = new Employee(1,"shivkumar",50000.0,10);
		lst1.add(e1); 
		e1 = new Employee(2,"Muskan",60000.0,20);
		lst1.add(e1);
		e1 = new Employee(4,"ashish",60000.0,20);
		lst1.add(e1);
		
		Employee e2 = new Employee(3,"Riidhi",70000.0,10);
		lst1.add(e2);
		e2 = new Employee(5,"Ujjwal",70000.0,10);
		lst1.add(e2);
		lst1.add(new Employee(6,"ishwar",80000.0,30));
		System.out.println(lst1);
		
		System.out.println("From list of Employee, extract all names by eliminating duplicates.. ");
		Set<String>empnames1= lst1.stream().map((Employee e)->e.getEmpName()).collect(Collectors.toSet());
		System.out.println(empnames1);
		
		System.out.println("Create a group of emp names of all Employees by eliminating duplicates whose salary >60000 ");
		Set<String>empsal=lst1.stream().filter((Employee e)->e.getEmpSalary()>60000).map((Employee e)->e.getEmpName()).collect(Collectors.toSet());
		System.out.println(empsal);
		
		System.out.println("Create a group of emp names of all Employees by eliminating duplicates whose deptno is 10 and salary > 60000.. ");
		empnames1 = lst1.stream().filter((Employee e)->e.getDeptno()==10 && e.getEmpSalary()>60000).map((Employee e)->e.getEmpName()).collect(Collectors.toSet());
		System.out.println(empnames1); //here we are using and condition in filter method we can also use more than one filter methods as to satisfy more than one condition.
		
		lst1.stream().filter((Employee e)->e.getDeptno()==10 ).filter((Employee e)->e.getEmpSalary()>60000).map((Employee e)->e.getEmpName()).collect(Collectors.toSet());
		//in the above line we are using two filter methods one is for department number==10 and second is for employee salary greater than 60000  
		
		
		System.out.println("finding an employee with highest salary");
		
		//1st way
		Optional <Employee>ex=lst1.stream().reduce((emp1,emp2)->emp1.getEmpSalary()>emp2.getEmpSalary()?emp1:emp2);
		if(ex.isPresent()) {
			System.out.println("Emplloyee with highest salaray "+ex.get());
		}
		
//		2nd way
		Comparator<Employee>c=(Employee ae,Employee be)->(int)(be.getEmpSalary()-ae.getEmpSalary());
		Optional <Employee>o=lst1.stream().sorted(c).findFirst();
		if(o.isPresent()) {
			System.out.println(o.get());
		}
		
//total salary of employee
		double i=lst1.stream().map((Employee e3)->e3.getEmpSalary()).reduce(0.0,(x,y)->x+y);
		System.out.println(i);
		
	}

}
