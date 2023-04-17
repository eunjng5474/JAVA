package algorithm;

import java.util.Scanner;
public class B_10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N+1];
		
		for(int i=1; i<N+1; i++) {
			arr[i] = i;
		}
		
		for(int m=0; m<M; m++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			while(true) {
				if(i>=j) break;
				
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				
				i += 1;
				j -= 1;
			}
		}
		for(int k=1; k<N+1; k++) {
		System.out.print(arr[k]+" ");
		}
	}
}
