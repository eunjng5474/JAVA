package test01;

public class PetsonTest {
	public static void main(String[] args) {
		Person p1 = new Person();  // 객체의 생성: new 키워드 + 생성자 호출 
		p1.name = "이승재";
		p1.age = 30;
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "홍승길";
		p2.age = 27;
		p2.eat();

	}

}
