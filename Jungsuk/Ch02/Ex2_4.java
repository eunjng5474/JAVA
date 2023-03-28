package ch02;
public class Ex2_4 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');          // 3
		System.out.println('3' - '0' + 1);				  // 4
		System.out.println(Integer.parseInt("3") + 1);	  // 4
		System.out.println("3" + 1);					  // 31
		System.out.println(3 + '0');   // '0'은 숫자로 48   // 51
		
		System.out.println('3' + 1);  			// 52
		System.out.println((char)(3 + '0'));    // 3
				
	}

}
