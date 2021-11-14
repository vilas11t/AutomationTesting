package vilas;

public class B extends A {
	
	void m3() {
	}
	
	void m1() {
		System.out.println("This is method1 form class B");
	}
	
	void m4() {
		System.out.println("This is method2 form class B");
	}
	
	
	public static void main(String[] args) {
		B b=new B();
		A a=new A();
		A a1=new B();
		
		b.m1();
		a.m1();
		a1.m1();
		
		
	}
	
	

}
