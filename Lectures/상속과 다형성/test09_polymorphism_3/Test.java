package test09_polymorphism_3;

public class Test {
	public static void main(String[] args) {
		Subclass child = new SubClass(); 
		System.out.println(child.x);  // sub
		child.method();	 // sub class method
		
		SuperClass parent = child;
		System.out.println(parent.x);   // super
		parent.method();   // super class method

	}

}
