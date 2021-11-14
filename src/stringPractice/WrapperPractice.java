package stringPractice;

public class WrapperPractice {
	public static void main(String[] args) {
   // sum of digits in string  String str=12Hello34 output=4.
		String str="12Hello347"; 
		System.out.println(Integer.parseInt(str));
		int digitCount=countDigits(str);
		System.out.println(digitCount);
	}
		
	static int countDigits(String s) {
		int sum=0;
		
          for (int i = 0; i < s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))){
				sum=sum+ Integer.parseInt(String.valueOf(s.charAt(i))) ;
			}
		}
		return sum;
	}

}
