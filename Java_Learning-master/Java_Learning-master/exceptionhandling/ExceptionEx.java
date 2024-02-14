package exceptionhandling;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		//for runtime exception and its subclasses compiler will not give compiler if you do not handle the exception using try-catch block
		System.out.println("Program starts");
//		s.concat("AAA"); //nullpointer exception
		System.out.println("remianing program");
		
		
		String s1=" 10";
		int n=Integer.parseInt(s1); //number format exception due to space in string s1
		int n1=Integer.parseInt(s1.trim());
		System.out.println(n1);
		
	}

}
