package junit.nama.mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

//import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
//import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import customeexception.Account;
import customeexception.InsufficientBalanceException;


@ExtendWith(MockitoExtension.class)//enabling mockito annotation
@TestInstance(Lifecycle.PER_CLASS)
public class MockitoMockAccountEx {
	
	@BeforeAll
	public void init() {
	    MockitoAnnotations.openMocks(this); //second method
   
}
	
	 @Mock
	    private Account obj;
	 @Spy
	 private Account obj1=new Account("joshi",1232,2000);
	 @Captor
     ArgumentCaptor<Double> argCaptor;
	 
	 @Test
	 public void whenUseMockAnnotation_thenMockIsInjected() {
			//by default, calling the methods of mock object will do nothing
		   
		 	try {
				obj.withdraw(500);
			    Mockito.verify(obj).withdraw(500);
			} catch (InsufficientBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 Mockito.when(obj.getBalance()).thenReturn(100.0);
		 double bal=obj.getBalance();
		 assertEquals(100.0,bal,"withdraw not working");//stubbing the mock
		 }
	@Test
	void testWithdrawSpy()
	{
		double foundNewBal = 0;
		try {
			foundNewBal = obj1.withdraw(500);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(foundNewBal);
		assertEquals(500, foundNewBal);
		
		try {
			doReturn(500.0).when(obj1).withdraw(500);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			assertEquals(500.0, obj1.withdraw(500));
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  @Test
 public void SpyAnnotationArgCaptureforaccount() {
		try {
			obj1.withdraw(1000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			Mockito.verify(obj1).withdraw(argCaptor.capture());
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    assertEquals(1000,argCaptor.getValue(),"Test fail:setOp1 arg should have been 15");
	    
	       
	    
	}

	
}