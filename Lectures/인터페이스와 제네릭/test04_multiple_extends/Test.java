package test04_multiple_extends;

public class Test {
	public static void main(String[] args) {
		// 다형성 
		DuckInterface d1 = new Duck();
		DuckInterface d2 = new UglyDuckling();
		DuckInterface d3 = new DonaldDuck();
		
		d1.playInnocent();  // 오리발을 내밀어요. 
		d2.playInnocent();  // 저는 오리가 아닐걸요? 
		d3.playInnocent();  // 저는 진짜 오리가 아니에요! 

	}

}
