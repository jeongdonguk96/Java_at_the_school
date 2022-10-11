package sec11_queue;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>(); // Queue는 LinkedList생성자를 이용하여 생성
		
		que.offer("one");
		que.offer("two");
		que.offer("three");
		que.offer("four");
		que.offer("five");
		que.offer("six");
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}

	}

}
