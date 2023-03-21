package day0318_;

import java.util.Scanner;

public class Test05_do_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		do {
			System.out.println("블록을 실행합니다.");
			num = sc.nextInt();
		} while (num == 1); 

	}

}
