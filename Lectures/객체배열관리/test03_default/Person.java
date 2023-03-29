package test03_default;

// class는 public 아니면 default
public class Person {
	String name;
	int age;
	// 접근제한자를 생략하면, default

	public static void main(String[] args) {
		Person p1 = new Person();
		// 자기 자신이므로 접근 가능
		p1.name = "이승재";
	}
}
