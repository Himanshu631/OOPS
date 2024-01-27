package collections.allcollections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(21);
		pq.offer(25);
		pq.offer(65);
		pq.offer(45);
		pq.offer(12);

		System.out.println(pq);

		pq.poll();
		
		System.out.println(pq);
		System.out.println(pq.peek());
		
	}

}
