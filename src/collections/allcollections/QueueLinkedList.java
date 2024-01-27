package collections.allcollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(25);
		queue.offer(50);
		queue.offer(75);
		queue.offer(100);
		queue.offer(125);
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.peek());
		
		System.out.println(queue.element());
		
	}

}
