
package day0328;

import java.util.*;

public class B_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String num = scanner.next();
		
		int sum_n = 0;
		
		for(int i = 0; i < N; i++) {
			sum_n += num.charAt(i) - '0';
		}
		System.out.println(sum_n);
		
	}

}
