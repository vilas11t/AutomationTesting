package introduction;

public class prime {
	public static void main(String[] args) {
		int i,n=7;
	
		for(i=2;i<=n/2;i++) {
			int b=0;
			if (n%i==0)
			{
				b=b++;
		System.out.println("the number is not prime");
				
			}
			else
			{
				System.out.println("the number is prime");
			}
		}
			
	}

}
