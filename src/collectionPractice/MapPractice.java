package collectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "swapnil");
		map.put(12, "kedar");
		map.put(31, "rahul");
		
		 // System.out.println(map);
		  
		  Set s=map.entrySet();
		  System.out.println(s);
		
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+ ":" +m.getValue());
		}
		
	}

}
