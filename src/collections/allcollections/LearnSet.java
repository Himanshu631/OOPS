package collections.allcollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
//		Set<Integer> s = new HashSet<>();
//		Set<Integer> s = new TreeSet<>();
		Set<Integer> s = new LinkedHashSet<>();
		
		
		s.add(12);
		s.add(62);
		s.add(12);
		s.add(32);
		s.add(99);
		s.add(92);
		s.add(12);
		
		System.out.println(s);
		
		
	}

}
