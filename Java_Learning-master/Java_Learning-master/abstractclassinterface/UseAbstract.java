package abstractclassinterface;

import abstractclassinterface1.copy.Hankerchief;

//program to calculate area and perimeter of different shape
public class UseAbstract {

	public static void main(String[] args) {
		
		
       Hankerchief s;
      //  s = new Shape();
      //  s.calcArea();
      
      // System.out.println("passing Square..");
	//	meth(new Square(10));
       
       s = new Hankerchief(10,"red");
       System.out.println("passing Hankerchief..");
       meth(s);
       
       
		System.out.println("passing Rectangle..");
		meth(new Rectangle(10,20));
		//meth(new Triangle(10,5));
		
		Shape s1 = new Rectangle(2,4);
		
		int area = s1.calcArea();
		System.out.println(area);
		
		 System.out.println("passing Rectangle..");
		meth(s1);

	}
	
	
	static void meth(Shape ob) //Shape ob = new Square(10)
	{
		
		System.out.println(ob);
		System.out.println("Area:"+ob.calcArea());
		System.out.println("Perimeter:"+ob.calcPm());
	}
	
	
	

}