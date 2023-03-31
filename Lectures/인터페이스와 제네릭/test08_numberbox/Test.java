package test08_numberbox;

public class Test {
	public static void main(String[] args) {
		// 제네릭 클래스의 변수를 선언 
		// 제네릭 클래스로 객체를 만듦
		// 선언과 객체 생성시 타입을 지정 
		NumberBox<Double> strBox = new NumberBox<>();
		strBox.setData(56.333);
		System.out.println(strBox.getData());
	
		
	}

}
