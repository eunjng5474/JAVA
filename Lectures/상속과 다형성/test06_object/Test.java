package test06_object;

import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Student st = new Student("박사홍", 28, "자바");
		st.eat();  // 필요하다면 자식 클래스에서 부모의 메서드를 재정의할 수 있다. 
		
		System.out.println(st.toString());  // Object의 메서드를 상속받고 있다. 
		// test06_object.Student@2a139a55 -> Person에서 재정의 하기 전 
		// Person [name=박사홍, age=28]  -> Person에서 override 이후 
		// Student [name=박사홍, age=28, major=자바] -> Student에서 override한 후 

		Student st2 = new Student("박사홍", 20, "자바");
		System.out.println(st == st2); // false   
		// 다른 객체. 주소이 다르기 때문 
		System.out.println(st.equals(st2)); 
		// Student에서 override 하기 전:  false
		// 주소값을 비교하고 있기 때문에 다르게 나온다.
		
		// Student에서 Override한 후 : true
		// 이름만 같아도 같다고 override했으므로 
		
		Object o = new Object();
		o.equals(st);
		// 이름만 같으면 같은 사람(학생)이다.
		
		// 집합 
		Set<Student> set = new HashSet<>();
		set.add(st);
		set.add(st2);
		
		System.out.println(set.size());  // 집합에 들어있는 원소의 개수  // 2
		// set에서는 동일성을 판단하기 위해서 equalts(), hashcode();
		// Student에서 재정의 한 후 : 1
		// hashcode를 재정의하고 나서야 두 객체를 같은 것으로 본다. 
	}

}
