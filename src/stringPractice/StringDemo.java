package stringPractice;

public class StringDemo {
	
	public static void main(String[] args) {
		String str=new String("Hello");
		String str1="Hello";
		String str2="Hello how are you";
		String str3="hello123";
		
		char[] c=str3.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
             if(Character.isDigit(c[i]))
            	 System.out.println(c[i]);
		}
		
		
		String[] str4=str2.split(" ");
		
		for (int i = 0; i < str4.length; i++) {
			System.out.println(str4[i]);
			
		}
				
	}

}
