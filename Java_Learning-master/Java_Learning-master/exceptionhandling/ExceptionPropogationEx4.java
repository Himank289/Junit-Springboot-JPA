package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionPropogationEx4 {

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
	
	
	static void func1(File f) throws IOException {  //throws will propogate the exception to the caller function
		func(f);
	}
		
		static void func(File f) throws IOException {
				FileReader fr=new FileReader(f);
				System.out.println("reading from file");
				fr.read();
				fr.close();
	}
			
}
		
		
