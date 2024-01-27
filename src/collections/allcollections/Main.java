package collections.allcollections;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Student> studentset = new HashSet<>();
		
		studentset.add(new Student(11, "Paul"));
		studentset.add(new Student(2, "Knight"));
		studentset.add(new Student(15, "Shawn"));
		studentset.add(new Student(36, "Tim"));
		studentset.add(new Student(11, "Tamada"));
		studentset.add(new Student(11, "Tamada"));
		
		System.out.println(studentset);
		
		
	}

}
