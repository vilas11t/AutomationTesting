package collectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {
		// List
		// List- interface , ArraList - Class implementing interface List
		
		List<String> list=new ArrayList<String>();
		
		list.add("Kedar");
		list.add("swapnil");
		list.add("Suraj");
		

		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add("Rahul");
		
		
		List<Integer> list1=new ArrayList<Integer>();
		
		list1.add(3);
		list1.add(34);
		
		
		
		
		
	}

}
