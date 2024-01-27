package comparators;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Student ram = new Student(12, 99.75f);
		Student sita = new Student(4, 98.75f);
		Student amit = new Student(41, 89.75f);
		Student arjun = new Student(6, 86.75f);
		Student aman = new Student(14, 79.75f);
	
	//	if(ram < sita) {
	//		System.out.println("Sita is greater");
	//	}
		
//		if(ram.compareTo(sita) < 0) {
//			System.out.println("Sita is has more marks");
//		}
//		else if(ram.equals(sita)) {
//			System.out.println("Both are equal");
//		}
//		
//		else {
//			System.out.println("Ram has more marks");
//		}
		
		Student[] list = {ram,sita,amit,arjun,aman};
		
		System.out.println(Arrays.toString(list));
		
		Arrays.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.rollno - o2.rollno;
			}
			
		});
		
		System.out.println(Arrays.toString(list));
		
	}

}
