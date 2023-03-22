package test03;

public class Person {
	// static 키워드 -> 클래스 변수 
	// 이 클래스로 생성되는 모든 인스턴스가 공유 
	static String species = "호모 사피엔스 사피엔스";
	
	String name;
	int age;
	
	// 생성자를 만들지 않고..
	// 만약 설계도에 생성자가 하나도 없다면 JVM이 기본생성자를 추가해준다.
	// Person() {};
	
	public int add(int a, int b) {
		return a+b;
	}
	
	// 메서드의 종료 
	// - 블록의 끝을 만날 때 
	// - return문을 만날 때 (void에서도 return문을 쓸 수 있음) 
	public void study(String subject) {
		double probability = Math.random();
		System.out.println(subject+"를 공부합니다.");
		System.out.println("알고리즘 문제를 풉니다.");
		if(probability < 0.9999)
			return;
		
		System.out.println("게임을 합니다.");
		System.out.println("Lol 영상을 시청합니다.");
	}
	
	public void eat() {
		// 지역 변수
		String dish = "짜장면";
	}

}
