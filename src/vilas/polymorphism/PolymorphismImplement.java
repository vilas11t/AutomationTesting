package vilas.polymorphism;

public class PolymorphismImplement {
	
	public static void main(String[] args) {
		Bank b1=new Bank();
		
		Bank b2=new SBI();
		
		SBI sbi=new SBI();
		
		System.out.println(b1.rateOFInterest());
		
		System.out.println(b2.rateOFInterest());
		
		System.out.println(sbi.rateOFInterest());
		
		
		
		
	}

}
