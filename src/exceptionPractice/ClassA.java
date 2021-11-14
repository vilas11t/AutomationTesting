package exceptionPractice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ClassA {
	
	public static void main(String[] args) {
		int a=0,b=5,c=0;
		
		System.out.println("Before exception statement ");
		
		try {
		 a=b/c;
		}catch(ArithmeticException  e ) {
			System.out.println(e.toString());
			
		}
			
		
		
		
		
		finally {
			System.out.println("This is finally block statement");
		}
		
		
		System.out.println("after exception statement");
		
	}

}
