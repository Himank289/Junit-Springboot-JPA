package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionUsingFinallyEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("xyz.java");
		System.out.println("program begins");
		
		try {
			func1(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("remaining program ");
	}
	
	
	static void func1(File f) throws IOException {
		func(f);
	}
		
		static void func(File f) throws IOException {
			FileReader fr=null;
			try {
				 fr=new FileReader(f);
					char ch=(char)fr.read();
					fr.read();
					System.out.println("reading from file");
			}
				finally {
					if(fr!=null) {
						System.out.println("Finally block will always execute");
						fr.close();
					}
					
				}
			System.out.println("remaining code inside function");
			
	}
			
}
		
		
