package test01;
// 모든 클래스는 특정 패키지(폴더)에 속해있음 
// 패키지: 클래스가 모여있는 폴더 

// class 키워드를 사
public class Person {
	// 속성, 데이터, 필드, 변 
	String name;
	int age;
	
	// 생성자 
	// 클래스명과 같다 
	// 반환형을 지정하지 않는다.(메서드와 다름)
	public Person() {
		
	}
	
	// 메서드
	public void eat() {
		System.out.println(name+"이 식사를 합니다.");
	}

}
