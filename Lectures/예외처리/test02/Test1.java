package test02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {

	public static void main(String[] args) {
		method1("1234");
		try {
			method2("input.txt");
		} catch (FileNotFoundException e) {
			System.out.println("CheckedExceptio이니까 반드시 처리..");
		}

	}
	
	public static void method1(String str) {
//		 NumberFormatException: UncheckedException
//		 굳이 예외처리 하지 않아도 컴파일은 됨.
//		 강제사항이 아님 
		int num = Integer.parseInt(str);
	}
	
	// throws 키워드를 이용해서 
	// 내 메서드 안에서 일어날 수 있는 예외를 
	// 나를 호출한 곳으로 전가시킴 
	public static void method2(String filename) throws FileNotFoundException {
		// FileNotFoundException : CheckedException 
		// 컴파일이 되지 않음. 
		// 강제사항 
		// try - catch 또는 throws 필요 
		FileReader reader = new FileReader(filename);
	}
}
