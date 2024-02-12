package mymath;

public class Calculator {
	private double op1;
	private double op2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calculator c=new Calculator(20,0);
		
	double f=c.div1();
	System.out.println(f);
	
	double r=c.div();
	System.out.println(r);
	
	
	}

	public Calculator(double op1, double op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}

	public double getOp1() {
		return op1;
	}

	public void setOp1(double op1) {
		this.op1 = op1;
	}

	public double getOp2() {
		return op2;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}
	
	  public double add () {
		   return this.op1+this.op2;
	   }
	  public double sub () {
		   return this.op1-this.op2;
	   }
	  
	  public double mul () {
		   return this.op1*this.op2;
	   }
	  
	  public double div () {
		  if(this.op2!=0) {
		   return this.op1/this.op2;
	   }
		  else {
			  throw new IllegalArgumentException();
		  }
	  }
	  
	  public double div1() {
				   return this.op1/this.op2;
	   }

	@Override
	public String toString() {
		return "Calculator [op1=" + op1 + ", op2=" + op2 + "]";
	}



 


}
