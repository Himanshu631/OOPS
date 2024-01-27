package collections.allcollections;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		st.push(25);
		st.push(5);
		st.push(29);
		System.out.println(st.peek());
		st.push(36);
		System.out.println(st.peek());
		
		System.out.println(st.pop());
		
		System.out.println(st.isEmpty());
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st.isEmpty());
		
		try {
			st.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
