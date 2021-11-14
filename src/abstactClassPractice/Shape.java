package abstactClassPractice;

public abstract class Shape {
	
	abstract void draw();
	abstract void m1();
	
	Shape(){
		System.out.println("This is abstract class Constructor");
	}
	
	void dimensions() {
		System.out.println("print dimensions");
	}

}
