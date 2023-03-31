package algorithm;

import java.util.Scanner;
import java.util.Arrays;
// array 정렬 위함 

public class B_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] lst = new int[N];
		// N개만큼의 숫자를 넣을 배열 생성 
		
		for(int i = 0; i < N; i++) {
			lst[i] = sc.nextInt();
		}
		// for문 돌면서 입력값 lst에 추가 
		
		Arrays.sort(lst);  // 정렬 
		System.out.println(lst[0]+" "+lst[N-1]);
		

	}

}
