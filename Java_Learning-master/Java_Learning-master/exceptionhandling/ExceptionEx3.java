package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("xyz.java");
		System.out.println("program begins");
		
		func(f);
		System.out.println("remaining program ");
	}
		
		static void func(File f) {
			try {
				FileReader fr=new FileReader(f);
				System.out.println("reading from file");
				fr.read();
				fr.close();
	}
			catch(FileNotFoundException e) {
				System.out.println("Specific exception for filenot found sub exeception extending from generalisedIOException");
				e.getMessage();
			}
			
			
			catch(IOException e) {
				e.printStackTrace();
				e.getMessage();
			}
			
			System.out.println("rest of the code");

		}
		}
		
		
