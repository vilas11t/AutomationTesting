package exceptionPractice;

import java.io.File;
import java.io.FileReader;

public class CheckedException {
	
	public static void main(String[] args) {
		int a,b,c;
		File file=new File(System.getProperty("user.dir")+"//file1.txt");
		try {
		  
			FileReader fr=new FileReader(file);
		   
		}catch(Exception e ) {
			e.printStackTrace();   //e.getMessage, e.toString
		}
		
	}

}
