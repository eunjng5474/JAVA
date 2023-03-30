package test08_polymorphism_2;

public class Person { // extends Object가 생략되어있음  
	String name;
	int age;
	
	// 파라미터가 있는 생성자 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
	// Source - Generate toString()
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
