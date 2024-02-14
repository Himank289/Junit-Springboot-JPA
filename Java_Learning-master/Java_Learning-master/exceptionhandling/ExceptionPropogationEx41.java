package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionPropogationEx41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("xyz.java");
		System.out.println("program begins");
		
		try {
			func1(f);
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("remaining program ");
	}
	
	
	static void func1(File f) throws IOException, SQLException {
		
		//its handle or declare not handle and declare  so compiler expects us to add either try catch or throws clause
		//but if we add both (which is not needed) at runtime catch block will be checked first if matching catch block is not found then it will propogate the exception to the caller
		//
		func(f);
		funcc(f);
	}
	
	static void funcc(File f) throws SQLException {
		java.sql.Connection conn=DriverManager.getConnection("");
				
	}
		
		static void func(File f) throws IOException {
				FileReader fr=new FileReader(f);
				System.out.println("reading from file");
				fr.read();
				fr.close();
	}
			
}
		
		
