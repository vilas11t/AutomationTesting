package collectionPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice1 {
	public static void main(String[] args) {
		Set<String> s1=new TreeSet<String>(); 
		s1.add("xyz");
		s1.add("abc");
		s1.add("mno");
				
		Iterator<String> it =s1.iterator();
		
		while(it.hasNext()) {   // hasNext, next, remove
			System.out.println(it.next());
			
		}
		
		
		
		
		
		
		
	}

}
