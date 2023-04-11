package test02_set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		// Set
		// - 집합을 나타내는 자료구조 
		// - 중복을 허용하지 않음 
		// - 순서도 없음 
//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>();
		
		// HashSet
		// - 해시 테이블에 원소를 저장 
		// - 성능면에서 우수하다고 알려져 있음 
		// - 원소들의 순서가 일정하지 않음 
		
		// TreeSet
		// - red-black tree에 원소 저장 
		// - 값에 따라서 순서가 결정 
		// - 값을 순서대로 정렬할 필요가 있다면 고려해볼만한 선택지
		
		
		set.add("홍승길");
		set.add("홍승길");
		set.add("정민우");
		set.add("이승재");
		
		System.out.println(set);
		
		System.out.println("홍승길".hashCode());  // 고유한 정수값으로 나타낸 것
		System.out.println("홍".hashCode());
		System.out.println(new String("홍승길").hashCode());
		// 같은 문자열이면 같은 해시코드값
		System.out.println("홍승길".equals("홍승길"));
		
		// 반복자
		Iterator<String> e = set.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
	}

}
