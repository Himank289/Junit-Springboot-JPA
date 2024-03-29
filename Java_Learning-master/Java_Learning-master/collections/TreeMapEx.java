package collections;
import java.util.*; 

public class TreeMapEx {
	
	 public static void main(String args[]){  
	   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(200,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	      
	      
	      //remove method 
	      map.remove(102);      
	      System.out.println("After invoking remove() method");  
	      for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	      
	      //Maintains descending order  
	      System.out.println("descendingMap: "+map.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+map.headMap(102,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(100, false, 102, true));   
}  
}  

