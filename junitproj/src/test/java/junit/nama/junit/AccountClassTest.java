package junit.nama.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import customeexception.Account;
import customeexception.InsufficientBalanceException;
import junit.nama.junitbasictest.MyUtils;

public class AccountClassTest {

	
	Account ob;
////		
//	/	@BeforeAll
//	public static void setupall{
//		System.out.println("This is a before all method execute only once before all test case runs");
//	}
//	threre are other methods also like beforeall,aftereach,afterall 
	@BeforeEach
	void setup()
	{
		 ob = new Account("Prateek Joshi",1001,2000);
	}

	@DisplayName("withdraw testing")
	@Test
	void testWithdraw() {
		
	
		try
		{
			
		
		  ob.withdraw(1500);
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		double bal = ob.getBalance();
		assertEquals(500,bal,"withdraw of Account not working as expected");
	}
	
	
	
	@DisplayName("test deposit method of Account")
	@Test
	void testDeposit() {
		
	
		try
		{
				 
		  ob.deposit(1500);
		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		double bal = ob.getBalance();
		assertEquals(3500,bal,"deposit of Account not working as expected");
	}
	
	
	@DisplayName("test withdraw if bal  is equal to amount")
	@Test()
	void testNotInsufficientBalance()
	{
		try
		{
		 ob.withdraw(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	     double bal = ob.getBalance();
		  assertEquals(0,bal,"withdraw method test failed for amt same as bal");
	}
	
	@DisplayName("test withdraw if bal  less than amount")
	@Test()
	void testInsufficientBalance()
	{
	      System.out.println("balance before withdraw:"+ob.getBalance());	
		  assertThrows(InsufficientBalanceException.class,
				 ()->ob.withdraw(2001));
	}

//	@AfterEach
//	public void tear{
//		System.out.println("This is a after each method execute each and every time a test case runs");
//	}
	
//	@AfterAll
//	public static void tearall{
//		System.out.println("This is a after all method execute only once after all test case runs");
//	}
	
	
//	assertDoesNotThrow

}
