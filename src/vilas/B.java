package vilas;

public class B extends A {
	
	void m3() {
		m1();
	}
	
	void m4() {
		System.out.println("This is method2 form class B");
	}
	
	
	public static void main(String[] args) {
		B b=new B();
		b.m3();
		
		System.out.println(a);
		
	}
	
	

}
