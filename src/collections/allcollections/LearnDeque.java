package collections.allcollections;

import java.util.ArrayDeque;

public class LearnDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.offer(25);
		dq.offerFirst(65);
		dq.offer(85);
		dq.offerLast(35);
		
		System.out.println(dq);
		
		System.out.println("peekfirst " + dq.peekFirst());
		System.out.println("peeklast " +dq.peekLast());
		
		System.out.println(dq);
		
		System.out.println("pollfirst " +dq.pollFirst());
		System.out.println("pollLast " +dq.pollLast());
		
		System.out.println(dq);
		
	}

}
