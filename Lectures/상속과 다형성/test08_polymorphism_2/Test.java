package test08_polymorphism_2;

public class Test {

	public static void main(String[] args) {
		Student st = new Student("박싸피", 23, "자바");
		
		Person p = st;
		
		Student st3 = (Student) p;
		st3.study();  // 공부를 한다. 
		
		Person p2 = new Person("김싸피", 28);
		
		Student st2 = (Student) p2;
//		st2.study(); // 에러 

	}

}
