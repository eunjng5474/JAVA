package test01_interface;

public class Test {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.method1();	// method 1
		m.method2();	// method 2
		System.out.println(m.MEMBER_1);		// 10
		System.out.println(m.MEMBER_2);		// 20
	}
}
