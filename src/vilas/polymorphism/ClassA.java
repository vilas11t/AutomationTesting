package vilas.polymorphism;

public class ClassA {
	
	int add(long a) {
		return (int) a;
	}
	
	int add(int a,int b) {
		return a+b;
	}
	
	float add(float a,int b) {
		return a+b;
	}
	

	double add(double a,int b) {
		return a+b;
	}
	
	
	
	
	public static void main(String[] args) {
		ClassA a=new ClassA();
		System.out.println(a.add((float)20.5, (short)30));
		
	}
	
	
	
	
	
	
}
