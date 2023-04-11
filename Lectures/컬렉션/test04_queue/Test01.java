package test04_queue;

import java.util.Queue;
import java.util.LinkedList;

public class Test01 {
	public static void main(String[] args) {
		// 큐(Queue) 
		// - FIFO
		// - Queue 인터페이스 
		// - 구현체(클래스)는 LinkedList를 사용 
		Queue<Integer> queue = new LinkedList<>();
		
		// queue에다가 0부터 9까지 순차적으로 값을 집어넣기 
		for(int i=0; i<10; i++) {
			queue.offer(i);
		}
		
		// 큐에서 순차적으로 값을 꺼내기 
		// - 가장 먼저 들어간 값이 가장 먼저 나온다. 
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+" ");
		}

	}

}
