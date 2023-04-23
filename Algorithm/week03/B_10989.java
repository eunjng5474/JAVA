package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] cnt = new int[10001];
		// 카운팅 정렬 
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			cnt[num] += 1;
		}
		// 시간 줄이기 위해 StrignBuilder 사용(문자열 더하기) 
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			while(cnt[i] > 0) {
				// append로 추가 
				sb.append(i);
				sb.append('\n');
				cnt[i] -= 1;
			}
		}
		System.out.println(sb);
	}

}
