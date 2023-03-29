package test03_default;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		// 다른 클래스(Person)에 있지만 
		// 같은 패키지이므로 default 속성에 접근 가능!
		p1.name = "홍승길";

	}

}
