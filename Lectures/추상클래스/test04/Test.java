package test04;

public class Test {

	public static void main(String[] args) {
		// 자식 클래스에서 추상클래스에 없는 메서드를 추가해보자. 
		// eat
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
//		a1.eat();  // 불가능 
//		a1.speak();
		// 안되는 것을 해결하는 방법 2.
		// instanceof를 이용해서 형변환 
		
		// instanceof 연산자
		// 객체가 해당 클래스로 만든 객체이거나 
		// 객체가 해당 클래스의 조상 클래스로 만든 객체인 경우 true 
		// 자식 클래스나 전혀 상관 없는 클래스로 만든 객체인 경우 false 
		
		System.out.println(a1 instanceof Animal);  // true
		System.out.println(a1 instanceof Cat);     // true
		System.out.println(a1 instanceof Dog);	   // false 
		
		if(a1 instanceof Cat) {
			Cat c = (Cat) a1;
			c.eat();
		}
		
		if(a2 instanceof Dog) {
			Dog d = (Dog) a2;
			d.eat();
		}
		
		if(a3 instanceof Person) {
			Person p = (Person) a3;
			p.eat();
		}

	}

}
