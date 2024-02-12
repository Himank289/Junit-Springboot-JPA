package collections;

import java.util.Comparator;

import him.oops.java.Employee;

//comaprison based on salary oroher parameter
public class OneMoreWayCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//Doing typecatsing because of double salary
		return (int)(o1.getEmpSalary()-o2.getEmpSalary());
	}

}
