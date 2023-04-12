package test01;

public class Test4 {

	public static void main(String[] args) {
		// try ~ catch ~ catch
		try {
			int num = Integer.parseInt("ssafy");
			
			// 해당하는 catch 블록을 만나지 못한다면 
			// 예외는 처리되지 않는다. 
		} catch (ArithmeticException e) {
			System.out.println("해당 문자열은 정수로 바꿀 수가 없어요.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위가 넘어갔네요.");
		} 

	}

}
