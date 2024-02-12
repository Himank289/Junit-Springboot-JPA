package mymath;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import customeexception.InsufficientBalanceException;
import mymath.Calculator;

class CalculatorTest {
	 Calculator c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c=new Calculator(20,10);
		System.out.println("it will create object everytime");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	

	@DisplayName("testing  add function")
	@Test
	void addtest() {
		double r=c.add();
		assertEquals(30,r,"additon is wrong");
	}
	
	@DisplayName("testing  sub function")
	@Test
	void subtest() {
		double s=c.sub();
	assertEquals(10,s,"subtraction is wrong");
	}
	
	@DisplayName("testing  mul function")
	@Test
	void multest() {
		double m=c.mul();
		assertEquals(200,m,"multiplication is wrong");
	}
	
	
	@DisplayName("testing  div function")
	@Test
	void divtest() {
		double d=c.div();
		assertEquals(2,d,"divison is wrong");
	}
	
	@DisplayName("testing  divby 0  illegal argument exception")
	@Test
	void divtest1() {
		c.setOp2(0);
//		double d=c.div();
		 System.out.println("can't divide by zero");
				assertThrows(IllegalArgumentException.class,
						 ()->c.div());
	}
	

}
