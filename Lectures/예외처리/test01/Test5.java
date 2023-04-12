package test01;

public class Test5 {

	public static void main(String[] args) {
		// try ~ catch ~ catch
		try {
//			int num = Integer.parseInt("ssafy");
			int num = 4/0;
			
			// | 연산자를 이용해서, 하나의 catch 블록에서 
			// 다양한 종류의 예외를 동시에 처리 가능 
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("하나의 블록에서 세 가지 예외를 처리합니다.");
		}

	}

}
