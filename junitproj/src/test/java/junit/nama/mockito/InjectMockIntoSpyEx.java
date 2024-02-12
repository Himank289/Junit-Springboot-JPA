package junit.nama.mockito;
 
 
import java.sql.SQLException;

import java.util.Arrays;

import java.util.List;
 
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;

import org.junit.jupiter.api.TestInstance.Lifecycle;

import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;

import org.mockito.Mock;

import org.mockito.Mockito;

import org.mockito.MockitoAnnotations;

import org.mockito.Spy;

import org.mockito.junit.jupiter.MockitoExtension;
 
@TestInstance(Lifecycle.PER_CLASS)

@ExtendWith(MockitoExtension.class)

class InjectMockIntoSpyEx {


	    @Spy

	    Repository repository;
 
	    @InjectMocks

	    RepoService service;

	    @Test

	    void testSuccess_WithoutStubbingRepoGetStuffMethod() {

	        // Setup mock scenario

			/*

			 * try { Mockito.when(repository.getStuff()).thenReturn(Arrays.asList("A", "B",

			 * "CDEFGHIJK", "12345", "1234")); } catch (SQLException e) {

			 * e.printStackTrace(); }

			 */
 
	    	/* if u don't stub the getStuff() of Repository spy, it will call its original method

	    	   which will return dummy values inside.

	    	   In this case it will return strings "one","two" and "three" 

	    	   if you want it ito return something else then u will have to stub the

	    	   getStuff() method of spy repository */


	        // Execute the service that uses the mocked repository

	        List<String> stuff = service.getStuffWithLengthLessThanFive();
 
	        // Validate the response

	        Assertions.assertNotNull(stuff);

	        Assertions.assertEquals(2, stuff.size());

	    }


	    @Test

	    void testSuccess_WuthStubbingRepoGetStuffMethod() {

	        // Setup mock scenario

	try { 

		  Mockito.when(repository.getStuff()).thenReturn(Arrays.asList("A", "B",

												"CDEFGHIJK", "12345", "1234")); 

			  } 

			  catch (SQLException e) 

			  { e.printStackTrace(); }

 
	    		    	

	        // Execute the service that uses the mocked repository

	        List<String> stuff = service.getStuffWithLengthLessThanFive();
 
	        // Validate the response

	        Assertions.assertNotNull(stuff);

	        Assertions.assertEquals(3, stuff.size());

	    }

	    @Test

	    void testException_StubbingRepoGetStuffMethod() {

	        // Setup mock scenario

	        try {

	            Mockito.when(repository.getStuff()).thenThrow(new SQLException("Connection Exception"));

	        } catch (SQLException e) {

	            e.printStackTrace();

	        }
 
	        // Execute the service that uses the mocked repository

	        List<String> stuff = service.getStuffWithLengthLessThanFive();
 
	        // Validate the response

	        Assertions.assertNotNull(stuff);

	        Assertions.assertEquals(0, stuff.size());

	    }
 
	   

}
 
 