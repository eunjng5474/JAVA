import java.util.*;  // 1. import문 추가 

public class ScanfEx1 {

	public static void main(String[] args) {
		// 2. Scanner 클래스의 객체 생성 
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println(num);

	}

}
