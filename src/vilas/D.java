package vilas;

public class D extends C {
	
	int a=50,b=70;
	 
	 void m1() {
		 System.out.println("Method m1 from class D");
	 }
	 
	void m2() {
		
		System.out.println(this.a);
		System.out.println(super.a);
		this.m1();
		super.m1();		
		
	}
	
	public static void main(String[] args) {
		new D().m2();
	}
	 

}
