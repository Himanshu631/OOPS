package collections.allcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Ram");
		arr.add("Paul");
		arr.add("Coder");
		arr.add("Tester");
		
		System.out.println(arr);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		arr2.add(25);
		arr2.add(85);
		arr2.add(65);
		arr2.add(10);
		arr2.add(74);
		
		System.out.println(arr2.get(0));
		
		Iterator<Integer> it = arr2.listIterator();
		
		while(it.hasNext()) {
			System.out.println("iterator " + it.next());
		}
	}
}
