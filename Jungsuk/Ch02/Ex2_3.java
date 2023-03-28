package ch02;

public class Ex2_3 {

	public static void main(String[] args) {
		final int score;  // = 100;
		score = 200;
		System.out.println(score);
		
		boolean power = false;
		System.out.println(power);
		
//		byte b = 128;  //type mismatch erre: byte 범위 벗어남
		byte b = 127;  // -128 ~ 127
		
		int oct = 010;   // 8진수, 10진수로 8
		int hex = 0x10;  // 16진수, 10진수로 16
		System.out.println(oct);
		System.out.println(hex);
		
//		long l = 10_000_000_000;  // error
		long l = 10_000_000_000L;
		
//		float f = 3.14;  // error
		float f = 3.14f;
		double d = 3.14f;  // 가능
		
		System.out.println(10.0);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		char ch = 'A';
		int i = 'A';
		System.out.println(i);
		
		String str = "";  // 빈 문자열(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		
	}

}
