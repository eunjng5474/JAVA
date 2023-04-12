package test01;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		// java.lang.ArrayIndexOutOfBoundsException
//		int[] nums = {10};  // 0밖에 없음 
//		System.out.println(nums[1]);
//		System.out.println(nums[-1]); // 오버플로우가 발생할 때 음수가.. => long
		
		// java.lang.ArithmeticException
//		int num = 5 / 0;
		
		// java.lang.NumberFormatException
//		int num = Integer.parseInt("ssafy");
		
		// 예외는 언제 발생? throw 키워드를 사용해서,
		// new 예외생성자() => 예외 객체 
		// 예외 객체를 던질 때 발생 
		// 예외가 발생? 내부적으로는 예외 객체가 생성되어서 던져진 것임 
//		throw new ArrayIndexOutOfBoundsException();  // nums[20]
//		throw new ArithmeticException();
//		throw new NumberFormatException();
		
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외를 처리합니다.");
		}
		System.out.println("프로그램의 끝.");
	}

}
