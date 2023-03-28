package test05;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("박사홍", 28);
		Person p2 = new Person("양명균", 29);
		Person p3 = new Person("오지혜", 26);
		Person p4 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p4.name);


	}

}
